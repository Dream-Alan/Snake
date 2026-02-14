public class ForForDemo {
    public static void main(String[] args) {
        //需求:显示一天中的时和分
        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                System.out.println(hour + "时" + min + "分");
            }
        }
    }
}

