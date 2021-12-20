package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {

        cat cat1= new cat();

        cat[] cats= {new cat(),new cat(),new cat(),new cat(),new cat()};

        cats[0].setCatInfo("lala",5,"Female", "white", "british hair");
        cats[1].setCatInfo("vanila",1,"Male", "brown", "US hair");
        cats[2].setCatInfo("bimbo",6,"Female", "red", "Ragdoll");
        cats[3].setCatInfo("simba",2,"Male", "dark", "sphynx cat");
        cats[4].setCatInfo("catherine",3,"Female", "yellow", "maine coon");

        System.out.println(cats[3]);

        ArrayList<cat> maleCats= new ArrayList<>();
        maleCats.addAll(Arrays.asList(cats));
        maleCats.removeIf(p -> p.gender=="Female");

        ArrayList<cat> femaleCats= new ArrayList<>();
        femaleCats.addAll(Arrays.asList(cats));
        femaleCats.removeIf(p -> p.gender=="Male");

        System.out.println("have "+femaleCats.size()+ " Female cats");
        System.out.println("have "+maleCats.size()+ " Male cats");































    }
}
