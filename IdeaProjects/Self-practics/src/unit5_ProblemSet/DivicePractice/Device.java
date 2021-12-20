package unit5_ProblemSet.DivicePractice;

public class Device {

    String brand;
    String model;
    double price;
    boolean hasWireless;

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasWireless=" + hasWireless +
                '}';
    }

    public void useDevice(){

        System.out.println(brand +" is using wireless device: "+hasWireless);

    }


}
