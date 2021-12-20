package day39_CustomClass;

public class DogPark {
    // dogPrak has  5 dogs
    public static void main(String[] args) {


        dog dog1= new dog();
        dog[] dogPark={new dog(),new dog(),new dog(),new dog(),new dog()};

        dogPark[0].setDogInfo("karaoglan","german shepperd","medium",6,"black");
        dogPark[1].setDogInfo("rolo","german shepperd","medium",3,"brown");
        dogPark[2].setDogInfo("champ","retriver","small",1,"dark");
        dogPark[3].setDogInfo("akbas","anatolian sheppard","large",2,"black");
        dogPark[4].setDogInfo("grizzly","boerpitt","large",4,"mix");


        for(int i=0; i <= dogPark.length-1;i++){
            dogPark[i].getDogInfo();

        }

        System.out.println("================================");


        for(dog eachDog: dogPark ){
            eachDog.getDogInfo();

        }
        System.out.println("==================================================================");

        dogPark[0].eat("treats");
        dogPark[1].eat("polo");
        dogPark[2].eat("lagman");
        dogPark[3].eat("solo");
        dogPark[4].eat("treats");

        System.out.println("=========================================");

        dogPark[0].drink("milk");
        dogPark[1].drink("milk");
        dogPark[2].drink("milk");
        dogPark[3].drink("milk");
        dogPark[4].drink("milk");

        System.out.println("=====================================");

       for (int i=0; i<dogPark.length; i++){
           dogPark[i].drink("milk");
       }

        System.out.println("===============================================================");

       for (dog eachDog: dogPark){
           eachDog.sleep();
       }

        System.out.println("===============================================");

       for (int i=0; i< dogPark.length;i++){
           dogPark[i].eat("treats");
       }




    }




}
