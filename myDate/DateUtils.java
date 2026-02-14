package myDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtils {
    private DateUtils(){}
    public static String dateToString(Date d,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s=sdf.format(d);
        return s;
    }
    public static Date stringToDate(String format,String s) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date d=sdf.parse(s);
        return d;
    }
}

