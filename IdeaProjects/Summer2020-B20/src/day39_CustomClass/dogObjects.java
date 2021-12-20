package day39_CustomClass;

public class dogObjects {
    public static void main(String[] args) {
        dog dog1= new dog();
        dog dog2= new dog();
        dog dog3= new dog();
        dog dog4= new dog();

        dog1.setDogInfo("mimi","kangal","medium", 2,"mix");
        dog2.setDogInfo("roofus","argentinian dogo","large", 1,"white");
        dog3.setDogInfo("winston","scotties terrier","small", 3,"black");
        dog4.setDogInfo("mimi","hakis","medium", 4,"brown");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("kella pella");
        dog2.eat(" pella");
        dog3.eat("kella ");
        dog4.eat("steak");

        dog1.drink("kola");
        dog3.drink("redbulk");
        dog2.drink("milk");
        dog4.drink("ginger");

        dog1.sleep();
        dog4.sleep();
        dog3.sleep();











    }
}
