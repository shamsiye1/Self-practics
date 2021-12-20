package day41_Static;

import java.util.ArrayList;

public class catObjects_Loop {
    public static void main(String[] args) {
        cat cat1= new cat();

        cat[] cats= {new cat(),new cat(),new cat(),new cat(),new cat()};

        cats[0].setCatInfo("lala",5,"Male", "white", "british hair");
        cats[1].setCatInfo("vanila",1,"Male", "brown", "US hair");
        cats[2].setCatInfo("bimbo",6,"Female", "red", "Ragdoll");
        cats[3].setCatInfo("simba",2,"Female", "dark", "sphynx cat");
        cats[4].setCatInfo("catherine",3,"Female", "yellow", "maine coon");


        ArrayList<cat> maleCats= new ArrayList<>();
        ArrayList<cat> femaleCats= new ArrayList<>();

//        for (int i=0; i< cats.length; i++){
//           if (cats[i].gender=="Male"){
//               maleCats.add(cats[i]);
//           }else{
//               femaleCats.add(cats[i]);
//           }
//        }

        for (cat each: cats){
            if (each.gender=="Female"){
                femaleCats.add(each);
            }else{
                maleCats.add(each);
            }
        }

        System.out.println("have "+femaleCats.size()+ " Female cats");
        System.out.println("have "+maleCats.size()+ " male cats");



















































    }
}
