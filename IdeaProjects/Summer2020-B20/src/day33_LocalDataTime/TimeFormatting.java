package day33_LocalDataTime;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {

    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/YYYY, E, EEEE");

        LocalDate ld = LocalDate.of(2020, 7, 8);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));


        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println("========================");

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        System.out.println(now.format(timeFormat));

        // May/20/2019 DayName 4:30pm
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime oneDay = LocalDateTime.of(2019, 5, 20, 16, 30);
        System.out.println(oneDay);
        System.out.println(oneDay.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));


        // Saturday 4:34:45 pm
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now= LocalDateTime.now();
        System.out.println(Now);

        System.out.println(Now.format(dtf));



    }


}
