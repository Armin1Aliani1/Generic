package com.generic.genericTestOne;

public class GenericApplicationOne {
    public static void main(String[] args) {
        MyNonGenericClass myNonGenericClassObject = new MyNonGenericClass();
        System.out.println("Show Integer was called! " + myNonGenericClassObject.showInteger(100));
        System.out.println("Show String was called! " + myNonGenericClassObject.showString("Hi"));
        System.out.println("Show Double was called! " + myNonGenericClassObject.showDouble(2.2));
    }
}
