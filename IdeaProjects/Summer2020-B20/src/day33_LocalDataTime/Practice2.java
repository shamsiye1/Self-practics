package day33_LocalDataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {

        String[] students = {"kalbinur kaherman", "virginia truba", "ernis", "isa", "odina"};
        LocalDate[] birthdays = {LocalDate.of(1982, 02, 02),
                LocalDate.of(1999, 2, 5),
                LocalDate.of(1999, 2, 5),
                LocalDate.of(1999, 2, 5),
                LocalDate.of(2004, 2, 5)
        };

        // odina: May/23/80 Monday

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " : " + birthdays[i].format(dateFormat));
        }


    }


}
