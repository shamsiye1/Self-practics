package day46_ConstructorCalls;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConstructorCalls3 {

    public ConstructorCalls3(){


    }

    public ConstructorCalls3(int a){
       this();
        System.out.println("Y");
        //this();  there will appear compile error, reason is must be called in first step
    }

    public ConstructorCalls3(double a){


    }

    public void method1(){
        // ConstructorCalls3();   cannot be call, reason is cannot be called by name.
       // this();  cannot use this keyword, reason is can only be used in a constructor.
    }





}
