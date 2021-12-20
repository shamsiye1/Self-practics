package day26_multiDimensionalArrays;

import java.util.Arrays;

public class multiD_array_Practise {
    public static void main(String[] args) {
      /*
      testers: {"shamsiye","mubarak","patigul","kamarya"}
      developers: {"asiye", "nazakat", "muradel", "shamsiye","gulen"}
      SM:{"ahmed"}
      PO:{"nadir"}
      BA:{"alim"}
      */
        String[] testers= {"shamsiye","mubarak","patigul","kamarya"};
        String[] developers= {"asiye", "nazakat", "muradel", "shamsiye","gulen"};
        String[]sm= {"ahmed"};
        String[] po= {"nadir"};
        String[] ba = {"alim"};

        String[] testers2={"irene", "aslan"};
        String[][] scrumTeam = {testers, developers, sm,po, ba};

          scrumTeam[4][0]= "adam";

          scrumTeam[0]= testers2;
          scrumTeam[3][0] = "zaki";

        System.out.println(Arrays.deepToString(scrumTeam));

        for(String[]  each: scrumTeam){
           for(String name: each){
               System.out.println(name);
           }
            System.out.println(Arrays.deepToString(scrumTeam));
        }

        System.out.println("===========================================");

        int[][] scores = {{10,50,85,45},{60,50,82,105},{93,58,85,45}};

        for( int[] each1DArray: scores){
            for( int eachElement: each1DArray){
                if(eachElement%3 ==0 || eachElement%5==0){
                    System.out.print(eachElement+ " ");
                }

            }

        }

        System.out.println("==========================================================");

        int[][] a1= {{1,2,8}, {4,8,9}};
        int[][] a2={{8,9,7,8},{5,8,9,55,7}};

        int[][][] arr3D = {{{1,2,8}, {4,8,9}},{{8,9,7,8},{5,8,9,55,7}}};
































    }

































































}
