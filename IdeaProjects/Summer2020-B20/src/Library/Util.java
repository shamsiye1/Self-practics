package Library;

import java.time.LocalDate;
import java.util.Arrays;

public class Util {


    public static String removeDup(String str) {
        String nonDup = "";
        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup = nonDup + each;
            }
        }
        return nonDup;


    }


    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static String Unique(String str) {
        String uniques = "";

        for (int i = 0; i <str.length(); i++) {
            char ch= str.charAt(i);
          int countNum= frequency(str, ch);
          if(countNum==1){
              uniques= uniques+ch;
          }
        }
          return uniques;

    }

    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }

        }
        return count;
    }

    public static String frequencyOfChar(String str){
        String expectedResult="";

        String nonDup= Util.removeDup(str);

        for(int i=0; i<nonDup.length(); i++){
            char ch= nonDup.charAt(i);
            int count= Util.frequency(str, ch);
            expectedResult= expectedResult+ ch+ count;
        }
        return expectedResult;
    }

    public static String formatFullName(String firstName, String lastName){
        firstName= firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName= lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        String fullName= firstName+ " "+ lastName;
        return fullName;
    }

    public static int[] addElement(int[] arr, int num){
        int[] arr2=new int[arr.length+1];
        arr2[arr2.length-1]=  num ;
//        int i=0;
//        for (int each: arr){
//            arr2[i]= each;
//            i++;
//        }
        for(int i=0; i< arr.length; i++){
            arr2[i] = arr[i];

        }
        return arr2;

    }

    public static int[] UniqueElement(int[] arr){
        for (int element: arr){
            int count=0;
            for(int each:arr){
                if(element==each){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+ " ");
            }
        }
        return arr;
    }

    public static LocalDate HappyBirthDay(int year, int month, int day){
        LocalDate birthDay= LocalDate.of(year, month, day);
        LocalDate today= LocalDate.now();

        int month2= today.getMonthValue();
        int day2= today.getDayOfMonth();
        if(month2== month && day2==day ){
            System.out.println("Today is your birthday");
            System.out.println("   \n \t \t \t    * * * * * * * * * * *  * * * * *");
            System.out.println("   \t \t \t \t    * * * * * * * * * * * * * * * * ");
            System.out.println("  \t \t  \t \t* *                             * * ");
            System.out.println(" \t \t \t \t* *      Happy BirthDay To You    * * ");
            System.out.println("  \t \t  \t \t* *                             * * ");
            System.out.println("   \t \t \t \t *   * * * * * * * * * * * * * * * * ");
            System.out.println("   \t \t \t \t    * * * * * * * * * * * * * * * *");


        }else{
            System.out.println("Today is not your birthday yet");
        }



        return today;

    }

    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);
        Integer[] arr2= new Integer[arr.length];
        int k= arr.length-1;
        for(int i=0; i<arr2.length; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;
    }


}
