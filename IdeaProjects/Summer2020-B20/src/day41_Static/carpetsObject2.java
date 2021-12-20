package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetsObject2 {
    public static void main(String[] args) {
        carpet[] carpets= {new carpet(),new carpet(),new carpet(),new carpet(),new carpet()};

        carpets[0].customOrder(4.5, 5.6, 5.9, false);
        carpets[1].customOrder(9.5, 8.6, 5.7, true);
        carpets[2].customOrder(49.5, 57.6, 15.9, false);
        carpets[3].customOrder(9.7, 6.1, 78.79, true);
        carpets[4].customOrder(4.51, 50.6, 8.4, false);


        ArrayList<carpet> persianCarpets= new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p-> ! p.isPersian);


        ArrayList<carpet> regularCarpets= new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        regularCarpets.removeIf(p-> p.isPersian);


        System.out.println("number of persian carpets: "+ persianCarpets.size());
        System.out.println("number of regular carpets: "+ regularCarpets.size());






































    }
}
