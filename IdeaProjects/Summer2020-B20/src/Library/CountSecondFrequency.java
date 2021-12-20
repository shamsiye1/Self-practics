package Library;

import java.util.HashMap;
import java.util.Map;

public class CountSecondFrequency {


    public Character countSecondFreq(String str) {
        // String str="abbcccddddeeeee";

        int countFirstFreq = 0;
        int countSecondFreq = 0;

        char firstFreq = 0;
        char secondFreq = 0;

        for (int i = 0; i < str.length(); i++) {  // hold firstFreq
            int count = 0;
            if (firstFreq != str.charAt(i)) {

                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {

                        count++;
                    }

                }

                if(count>countFirstFreq){

                    countFirstFreq=count;
                    firstFreq=str.charAt(i);

                }else if (count>countSecondFreq){
                    countSecondFreq=count;
                    secondFreq=str.charAt(i);
                }
            }
        }
        return secondFreq;

    }

}

class practice{
    public static void main(String[] args) {
   CountSecondFrequency obj= new CountSecondFrequency();


        // public Character countSecondFreq
        String str="AABBCCCCDDFFFFF";  //2a 2b 4c 2d 5f

       System.out.println(obj.countSecondFreq(str));

       String result="";

       for (int i=0; i< str.length(); i++){

           int counter=0;
           if (!result.contains(str.charAt(i)+"")){
               for (int j=0; j< str.length();j++){
                     if (str.charAt(i)== str.charAt(j)){
                         counter++;
                     }
               }
               result += str.charAt(i)+""+counter;
           }



       }

        System.out.println(result);


        String st="seccuss";
        String unique="";

        for (int i = 0; i < st.length(); i++) {
               int counter=1;
            for (int j = i+1; j < st.length(); j++) {

                if ( st.charAt(i)==st.charAt(j) ){

                    counter++;

                }



            }
            if (!unique.contains(st.charAt(i)+"")){

                unique += st.charAt(i)+""+counter;
            }

        }
        System.out.println(unique);

        String name = "ZILNAZIM";
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            if( !map.keySet().contains(name.charAt(i)) )
                map.put( name.charAt(i),1);
            else
                map.put(name.charAt(i), map.get( name.charAt(i))+1 );
        }

        System.out.println(map);

        Map<Character,Integer> map2 = new HashMap<>();
        map2.put('a',5);
        map2.put('b',6);
        map2.put('f',8);
        map2.put('h',9);
        System.out.println(map2);
        System.out.println( map2.get('b'));




    }
}
