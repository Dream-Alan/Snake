package myDate;

import java.text.ParseException;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String f="yyyy-MM-dd HH:mm:ss";
        System.out.println(DateUtils.dateToString(date,f));
        String s="2021-10-10 10:10:10";
        System.out.println(DateUtils.stringToDate(f,s));

    }
}
