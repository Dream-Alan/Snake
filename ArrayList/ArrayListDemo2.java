package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> List=new ArrayList<>();
        List.add("Hello");
        List.add("World");
        List.add("Java");
        List.add(0,"Java");
        System.out.println(List);
        System.out.println(List.remove("Java"));
        System.out.println(List.remove("Javase"));
        System.out.println(List.set(0,"I"));
        System.out.println(List.remove(0));
        System.out.println(List.get(0));
        System.out.println(List);
        List.add(0,"Hello");
        System.out.println(List.add("I'm a programmer"));
        System.out.println(List);
        System.out.println(List.size());
    }
}
