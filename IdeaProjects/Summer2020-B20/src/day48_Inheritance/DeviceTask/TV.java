package day48_Inheritance.DeviceTask;

public class TV extends Device{
    /*
    Inherited:
      variables: brand, model price , madein , hasbattery, hasmemory, screensize
      mehods: setInfo, toString


      not inherited:   {we do not have yet: }
      variables: remoteControl
      methods: watch
     */

    public boolean hasRemoteControl;



    public TV(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize){
          setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
          this.hasRemoteControl= hasBattery;
    }

    public void watch(){
        System.out.println("Watching "+ brand+" "+model);
    }





}
