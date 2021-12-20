package carConstructorChaining;

public class DebitCard {

    long cardNum;
    String nameHolder;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    static {
        accountType="debit";
    }

    public DebitCard(long cardNum, String nameHolder, double balance){

        this.cardNum=cardNum;
        this.balance=balance;
        this.nameHolder=nameHolder;

        if (cardNum> 16 || cardNum<16){
            System.out.println("Invalid card number");
        }

    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardNum=" + cardNum +
                ", nameHolder='" + nameHolder + '\'' +
                ", cardType='" + cardType + '\'' +
                ", balance=" + balance +
                '}';
    }

    public DebitCard(long cardNum, String nameHolder, double balance, String cardType, int pin ){

        this(cardNum, nameHolder, balance);
        this.pin=pin;
        this.cardType=cardType;

        if (!cardType.equalsIgnoreCase("MasterCard")|| cardType.equalsIgnoreCase("visa")){
            System.out.println("invalid card type");
        }

        if (pin>4 || pin<4){
            System.out.println("invalid pin length");
        }


    }





}
