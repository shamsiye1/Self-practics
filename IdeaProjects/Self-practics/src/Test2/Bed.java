package Test2;

import java.util.ArrayList;

public class Bed {
    ArrayList<Pillow> pillows;

    public Bed(){
        pillows= new ArrayList<>();

    }



}

class Pillow{
    public static void main(String[] args) {
        Bed bed = new Bed();
        bed.pillows.add(new Pillow());
        bed.pillows.add(new Pillow());
        System.out.println(bed.pillows.size());
    }
}
