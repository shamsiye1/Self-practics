package a_mentorRequiredPractice;

public class Q04_UniqueFinding {

    public static void main(String[] args) {
        String str="aaacbbdeghkcc";
        String nonDup="";
        for (int i=0; i<str.length(); i++){
            int counter=0;
            for (int j=0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }
            if(counter==1) {
                nonDup += str.charAt(i) + "";
            }
        }
        System.out.println(nonDup);

    }
}
