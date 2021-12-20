package a_mentorRequiredPractice;

public class Q14_PermutationCombination {

    public static String permute(String name, String answer ) {



        if (name.length() == 0){
            System.out.println(answer);
        }else {

            for (int i = 0; i< name.length(); i++){ // abc

                char ch = name.charAt(i); //a   //b
                String leftSubstr = name.substring(0, i); //a    //b
                String rightSubstr = name.substring(i+1); // bc  //c
                String rest = leftSubstr + rightSubstr; //abc    //bc

                 permute(rest,answer + ch);
            }


        }


      return answer;
    }

    public static void main(String[] args) {
        String s = "abc";
        ;
        System.out.println(permute(s,""));


    }



}
