package academy.learnProgramming;


import java.sql.SQLOutput;

public class UnderstandingNull {
    static Object myObject = new Object();
    static Object myOtherObject;
    static int myInt;


    public static void main(String[] args) {


        Object myLocalObject = new Object();
        Object myAnotherLocalObject;
        String name = "Java";


        System.out.println("MyObject = " + myObject);
        System.out.println("My Other object =" + myOtherObject);
        System.out.println("MY INT = " + myInt);
        System.out.println("MY STRING = " + name);


        System.out.println("My Local objetct = " + myLocalObject);
       // System.out.println("My Another Local Object = " + myAnotherLocalObject);

    }



}
