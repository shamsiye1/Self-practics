package day28_Recap;

import java.util.Arrays;

public class ArraysShortQuiz {
    public static void main(String[] args) {
        char[] arr={'A','D','C','B'};
        Arrays.sort(arr);

        for(char each:arr){
            System.out.println(each);
            if(each=='D'){
                continue;
            }
        }
        System.out.println();

        System.out.println("===========================");

        int wd=0;
        String[] days= {"sun","mon","wed","sat"};

        for(int i=0;i<days.length; i++){

            switch(days[i]){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;
            }
        }

        System.out.println(wd);
        System.out.println("=====================================");



    int[] nums= {15,30,45,60,75};
    nums[2] = 75;
    nums[4]= 90;

        System.out.println(Arrays.toString(nums));


        int[] a={1,2,3,4};
        int y=0;

        do {
            System.out.println(a[y]);
            y++;//1,
        }while(y < a.length-1);
        //  y<3






































    }




















































}
