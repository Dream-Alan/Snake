package studentManager;
import java.util.Scanner;
import java.util.ArrayList;
public class studentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> list = new ArrayList<>();
        for (; ; ) {
            System.out.println("-------欢迎使用学生管理系统-------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.显示所有学生");
            System.out.println("6.退出");
            System.out.println("请输入你的选择：");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    changeStudent(list);
                    break;
                case "4":
                    System.out.println("请输入要查询的学生sid:");
                    String sid4 = sc.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        student s4 = list.get(i);
                        if (s4.getSid().equals(sid4)) {
                            System.out.println("学生sid:" + s4.getSid());
                            System.out.println("学生姓名:" + s4.getName());
                            System.out.println("学生年龄:" + s4.getAge());
                            System.out.println("学生地址:" + s4.getAddress());
                        }
                    }
                    break;
                case "5":
                    displayAll(list);
                    break;
                case "6":
                    System.out.println("谢谢使用");
                    System.exit(0);//JVM退出
            }
        }
    }
    public static void addStudent(ArrayList<student> List){
        Scanner sc=new Scanner(System.in);
        //为了让sid在死循环外还能被访问,将sid定义在循环外
        String sid;
        //为了输入存在的sid后还能回到第一步,使用循环
        while(true){
            System.out.println("请输入学生sid:");
            sid=sc.nextLine();
            boolean flag=exist(List,sid);
            if (flag){
                System.out.println("该学生已存在,请重新输入");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名:");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age=sc.nextLine();
        System.out.println("请输入学生地址:");
        String address=sc.nextLine();
        student s=new student(sid,name,age,address);
        List.add(s);
        System.out.println("添加成功");
    }
    public static void displayAll(ArrayList<student> list){
        if(list.isEmpty()){
            System.out.println("无学生信息，请添加学生信息");
            return;//为了让程序不再往下执行,使用return结束
        }
            System.out.println("sid\t\t\tname\tage\taddress");//"\t"制表符相当于一个Tab键
            for (int i = 0; i < list.size(); i++) {
                student s5 = list.get(i);
                System.out.println(s5.getSid() + "\t\t\t" + s5.getName() + "\t" + s5.getAge() + "岁\t" + s5.getAddress());
            }
    }
    public static void deleteStudent(ArrayList<student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的学生sid:");
        String sid=sc.nextLine();
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            student s2 = list.get(i);
            if (s2.getSid().equals(sid)) {
                index = i;
            }else {
                index=-1;
//                list.remove(i);
//                System.out.println("删除成功");
//                break;
//            } else {
//                System.out.println("该学生不存在");
            }
            if (index != -1) {
                list.remove(index);
                System.out.println("删除成功");
            } else {
                System.out.println("该学生不存在,请重新输入");
            }
        }

    }
    public static void changeStudent(ArrayList<student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的学生sid:");
        String sid3 = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            student s3 = list.get(i);
            if (s3.getSid().equals(sid3)) {
                System.out.println("请输入修改后的学号:");
                String sid2 = sc.nextLine();
                System.out.println("请输入学生姓名:");
                String name3 = sc.nextLine();
                System.out.println("请输入学生年龄:");
                String age3 = sc.nextLine();
                System.out.println("请输入学生地址:");
                String address3 = sc.nextLine();
                s3.setSid(sid2);
                s3.setName(name3);
                s3.setAge(age3);
                s3.setAddress(address3);
            }else {
                System.out.println("该学生不存在");
            }
        }
    }
    public static boolean exist(ArrayList<student> list,String sid){
        boolean flag=false;
        for(int i=0;i<list.size();i++){
            student s=list.get(i);
            if(s.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }

}

