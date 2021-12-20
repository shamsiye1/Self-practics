package day31_Recap;
import Library.Util;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str= "aabbddcc";

        String expectedResult="";

        String nonDup= Util.removeDup(str);

        for(int i=0; i<nonDup.length(); i++){
            char ch= nonDup.charAt(i);
            int count= Util.frequency(str, ch);
            expectedResult= expectedResult+ ch+ count;
        }

//        char ch1= nonDup.charAt(0);
//        int count1 = Util.frequency(str,ch1);
//        expectedResult= expectedResult+ch1+count1;
//
//        char ch2= nonDup.charAt(1);
//        int count2= Util.frequency(str, ch2);
//        expectedResult= expectedResult+ ch2+ count2;
//
//        char ch3= nonDup.charAt(2);
//        int count3= Util.frequency(str, ch3);
//        expectedResult= expectedResult+ch3+count3;
//
//        char ch4= nonDup.charAt(3);
//        int count4= Util.frequency(str, ch4);
//        expectedResult= expectedResult+ch4+count4;



        System.out.println(expectedResult);
    }

    public static String frequencyOfChar(String str){
        String expectedResult="";

        String nonDup= Util.removeDup(str);

        for(int i=0; i<nonDup.length(); i++){
            char ch= nonDup.charAt(i);
            int count= Util.frequency(str, ch);
            expectedResult= expectedResult+ ch+ count;
        }
        return expectedResult;
    }






















































}
