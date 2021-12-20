package unit5_ProblemSet.DivicePractice;

public class UseDevice {
    public static void main(String[] args) {

        TV tv = new TV();

        tv.brand = "sony";
        tv.hasWireless = true;
        tv.price = 200.89;
        tv.model = "x5";


        Phone device1 = new Phone();
        device1.hasWireless = false;
        device1.brand = "asus";
        device1.price = 700;
        device1.model = "y8";

        tv.useDevice();
        device1.useDevice();
        System.out.println(tv);
        System.out.println(device1);
    }
}
