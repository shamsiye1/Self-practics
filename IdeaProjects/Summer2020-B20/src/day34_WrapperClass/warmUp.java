package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmUp {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime memoryDay= LocalDateTime.of(2020,7,26,10,28,56);

        LocalDateTime today= LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.format(dateTimeFormatter));
        System.out.println(memoryDay);
        System.out.println(memoryDay.format(dateTimeFormatter));


































    }


}
