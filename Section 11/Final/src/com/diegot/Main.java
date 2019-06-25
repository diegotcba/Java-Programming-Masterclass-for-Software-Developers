package com.diegot;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.instanceNumber);
        System.out.println(two.instanceNumber);
        System.out.println(three.instanceNumber);

        System.out.println(Math.PI);

        int pw = 52745;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(2345234);
        password.letMeIn(123);
        password.letMeIn(-23);
        password.letMeIn(0);
        password.letMeIn(2345234);

        password.letMeIn(pw);


        SIBTest sibTest = new SIBTest();
        sibTest.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
