package day40_CustomClass_Practice;

public class BankAccount {
    //bank attributes/ data that havbe are:
    // accountholder accountnumber, balance accounttype

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String accountType, String  accountHolder, String accountNumber){
        this.accountType =accountType;
        this.accountHolder=  accountHolder;
        this.accountNumber= accountNumber;
    }

    public void getAccountInfo(){
        System.out.println("Account Holder: "+ accountHolder);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Available Balance: "+ balance);
    }

    public void CheckBalance( ){
        System.out.println("Available Balance: "+ balance);
    }

    public void deposit( double amount){
        System.out.println("Depositing $"+ amount+" to "+ accountNumber);
        balance= balance+ amount;
    }

    public void withDraw(double amount){
        if(amount> balance){
            System.out.println("not enough balance");
           // return;
        }else{
            System.out.println("Withdrawing $"+ amount+" from "+ accountNumber);
            balance= balance-amount;
        }
    }




}
