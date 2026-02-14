package myCalendar;
import java.util.Scanner;
import java.util.Calendar;
public class February {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=s.nextInt();
        Calendar c=Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");
    }
}
