package day28_Recap;

import java.util.Arrays;

public class multiDimensional_Practice {
    public static void main(String[] args) {
      String[] group33={"shamsiye","mubarak","patigul","kamarya"};
      String[] group22= {"asiye", "nazakat", "muradel", "shamsiye","gulen"};
      String[] group2 = {"irene", "aslan"};
      String[] group21 = {"violeta","anton", "aliya", "adam","liliya"};
      String[] group17 = {"elivira", "zeliha", "paban","dilyar","roza","kamil","sedge"};

      String[][] batch20 = {group33, group22, group2, group21,group17};

      for(int i=0; i<batch20.length; i++){
          String[] eachGroup = batch20[i];
          //System.out.println(Arrays.toString(eachGroup));

          for(int j=0; j< batch20[i].length; j++){
              String eachStudent= eachGroup[j];

              if(eachStudent.toLowerCase().contains("m")){

              System.out.print(eachStudent+ " ");
              }
          }
          System.out.println();
      }



















































































    }












































































}
