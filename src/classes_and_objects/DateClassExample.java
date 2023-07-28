package classes_and_objects;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassExample {
    public static void main(String arg[]) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(ft.format(date));

        String d = "18-01-2022 04:30:00 PM";
        SimpleDateFormat ft1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
        Date date1 =  ft1.parse(d);
        System.out.println(date1);



    }
}
