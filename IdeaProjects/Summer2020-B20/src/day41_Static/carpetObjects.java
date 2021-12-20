package day41_Static;

import java.util.ArrayList;

public class carpetObjects {
    public static void main(String[] args) {
//        carpet carpet1= new carpet();
//        carpet carpet2= new carpet();
//        carpet carpet3= new carpet();
//        carpet carpet4= new carpet();
//        carpet carpet5= new carpet();

        carpet[] carpets= {new carpet(),new carpet(),new carpet(),new carpet(),new carpet()};

        carpets[0].customOrder(4.5, 5.6, 5.9, false);
        carpets[1].customOrder(9.5, 8.6, 5.7, true);
        carpets[2].customOrder(49.5, 57.6, 15.9, false);
        carpets[3].customOrder(9.7, 6.1, 78.79, true);
        carpets[4].customOrder(4.51, 50.6, 8.4, false);

//             for(carpet each:carpets){
//            each.getCarpetInfo();
//        }

        ArrayList<carpet> persianCarpets= new ArrayList<>();
        ArrayList<carpet> regularCarpets= new ArrayList<>();

        for(int i=0; i< carpets.length; i++){
            if (carpets[i].isPersian){
                persianCarpets.add(carpets[i]);
            }else{
                regularCarpets.add(carpets[i]);
            }
        }

        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("number of regular carpets: "+ regularCarpets.size());








    }
}
