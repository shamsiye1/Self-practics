package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Cars car1= new Cars();
        Cars car2= new Cars();
        Cars car3= new Cars();
        Cars car4= new Cars();
        Cars car5= new Cars();

        car1.setInfo("lexus","rx350",2019,"blue",14000,450000);

        car2.setInfo("lexus","rs852",1999,"black",7000,9666);
        car3.setInfo("mercedez","v852",2019,"black",700000,19666);
        car4.setInfo("bugatto","rs82",2199,"red",7000,9666);
        car5.setInfo("lexus","rs852",1999,"dark",17000,99666);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();
        System.out.println("========================");

        car1.start();
        car5.start();


    }
}
