package day40_CustomClass_Practice;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class BOA {
    public static void main(String[] args) {

        BankAccount Dawud= new BankAccount();
        Dawud.setAccountInfo("saving","dawud abduwali","56563633");
        Dawud.getAccountInfo();
        Dawud.deposit(10000);
        Dawud.CheckBalance();
        Dawud.withDraw(500000);
        Dawud.CheckBalance();




























    }
}
