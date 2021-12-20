package day25_Practices;

public class FirstThreeChars {
    public static void main(String[] args) {

       String[] words={"Apple","banada","strawberry", "java","python"};
//        System.out.println(words[0].substring(0,3));
//        System.out.println(words[1].substring(0,3));

       for(int i=0; i< words.length; i++){
       System.out.println(words[i].substring(0,3));
}
        System.out.println("=====================================");

for(String each: words){
    System.out.print(each.substring(0,3)+ " ");
}






    }


























































}
