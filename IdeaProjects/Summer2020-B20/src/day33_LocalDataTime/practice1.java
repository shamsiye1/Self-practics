package day33_LocalDataTime;

import java.time.LocalDate;

public class practice1 {
    public static void main(String[] args) {
        String[] students= {"kalbinur kaherman","virginia truba","ernis","isa","odina"};
        LocalDate[] birthdays={LocalDate.of(1982,02,02),
                                LocalDate.of(1999,2,5),
                                LocalDate.of(1999,2,5),
                                LocalDate.of(1999,2,5),
                                 LocalDate.of(2004,2,5)};

        for(int i=0; i<students.length; i++){
            System.out.println(students[i]+ ": "+birthdays[i] );
        }

        System.out.println("=====================");

        for (LocalDate each: birthdays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }



    }

































}
