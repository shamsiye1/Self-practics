package day40_CustomClass_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffer {
    public static void main(String[] args) {

        offer offer1 = new offer();
        offer offer2 = new offer();
        offer offer3 = new offer();
        offer offer4 = new offer();
        offer offer5 = new offer();
        offer offer6 = new offer();
        offer offer7 = new offer();

        offer1.setOfferInfo(700000,"VA",true,false,true,"SDET", true);
        offer2.setOfferInfo(100000,"CA",false,true,false,"QA", false);
        offer3.setOfferInfo(200000,"VMA",true,true,true,"SDET", true);
        offer4.setOfferInfo(1400000,"DDA",false,false,false,"Senior QA", false);
        offer5.setOfferInfo(800000,"VAQ",true,true,true,"QA", false);
        offer6.setOfferInfo(180000,"AY",true,false,false,"DEVOP", true);
        offer7.setOfferInfo(102000,"VAI",false,true,true,"SDET", false);


        ArrayList<offer> jobOffer= new ArrayList<>();
        jobOffer.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

        for (offer eachOffer: jobOffer){
            eachOffer.getOfferInfo();
        }
        System.out.println("==============================================");

        // remove less than 120k

//        jobOffer.removeIf(p-> p.salary<120000);
//        System.out.println("number of offers: "+ jobOffer.size());

        // less than 120k or not from VA area
//        jobOffer.removeIf(p-> p.salary< 12000 || p.state.equals("VA"));
//        System.out.println("Numbers of offers: "+ jobOffer.size());

        // does not have PTO or does not have benefit or is not full time
        jobOffer.removeIf((p -> p.hasPTO==false || p.hasBenefit==false || p.isFullTime==false));
        System.out.println("Numbers of offers: "+ jobOffer.size());




































    }
}
