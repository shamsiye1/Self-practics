package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {


        String[] studentName = {"CYBERTEK", "muhtar","nadir"};
        String name1= studentName[2];
        System.out.println(name1);

        System.out.println("====================================");

        int[] scores = {45,56,55,45,45,52};
        String[] name = {"mike","adam","harry","hermine"};

//        System.out.println(name[0]+ ": "+ scores[0]);
//        System.out.println(name[1]+ ": "+ scores[1]);
//        System.out.println(name[2]+ ": "+ scores[2]);
//        System.out.println(name[3]+ ": "+ scores[3]);
//
     for (int i = 0; i<=3; i++){ // i: 0,1,2,3
         System.out.println(name[i] + ": " + scores[i]);
     }
        System.out.println("======================================");

String[] classMate = new String[5];

classMate[0] = "fatih";
classMate[1] = "Hazel";
classMate[2] = "ayim";
classMate[4] = "zilnazim";
classMate[3] = "halida";


for(int i = 0; i<=4; i++){
    System.out.println(classMate[i]);
}














































    }































































}
