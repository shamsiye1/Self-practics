package Test2;

import Test1.A;

public class Language{
public void method(){
    System.out.println("0");
}

public static class Java extends Language{

    @Override
    public void method(){
        System.out.println("1");
    }

}


class Selenium extends Java{

    public void method(){
        System.out.println("2");
    }
}

static class Main{
    public static void main(String[] args) {

        new Java().method();



    }


}

}
