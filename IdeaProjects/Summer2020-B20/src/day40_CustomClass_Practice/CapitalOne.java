package day40_CustomClass_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount ruslan= new BankAccount();
        BankAccount mubarak= new BankAccount();
        BankAccount asiya= new BankAccount();
        BankAccount nazakat= new BankAccount();
        BankAccount zilnaz= new BankAccount();

        ruslan.setAccountInfo("checking","ruslan","45522333555");
        mubarak.setAccountInfo("saving","mubarak","45662285844");
        asiya.setAccountInfo("checking","asiye","5555557731245");
        nazakat.setAccountInfo("checking","nazakat","55557789632");
        zilnaz.setAccountInfo("saving","zilnaz","555447785214");

        ArrayList<BankAccount> accounts= new ArrayList<>();
        accounts.addAll(Arrays.asList(ruslan,asiya,nazakat,zilnaz,mubarak));
        //                              0      1    2       3      4
        for (BankAccount each: accounts){
            each.deposit(500);
            each.getAccountInfo();
        }
        accounts.get(3).deposit(10000);
        accounts.get(3).CheckBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).CheckBalance();


        accounts.get(4).deposit(600);
        accounts.get(4).CheckBalance();

        System.out.println("=========================================================");

        accounts.removeIf(each-> each.balance<1000 );  // each==> each of the bank account
        System.out.println(accounts.size());

//        for (BankAccount each : accounts){
//            each.getAccountInfo();
//        }




















    }






















}
