package com.generic.genericTestTwo;

public class GenericApplicationTwo {
    public static void main(String[] args) {
        MyGenericClass myGenericClassObjectOne = new MyGenericClass();
        System.out.println(myGenericClassObjectOne.show(10));
        System.out.println(myGenericClassObjectOne.show("Armin"));
        System.out.println(myGenericClassObjectOne.show(12.8));
        System.out.println(myGenericClassObjectOne.show(true));
        System.out.println(myGenericClassObjectOne.show('a'));

        MyGenericClass<Integer> myGenericClassObjectTwo = new MyGenericClass();
        System.out.println(myGenericClassObjectTwo.show(20));
        System.out.println(myGenericClassObjectTwo.show(30));

        MyGenericClass<String> myGenericClassObjectThree = new MyGenericClass();
        System.out.println(myGenericClassObjectThree.show("Armin"));
        System.out.println(myGenericClassObjectThree.show("Aliani"));

        MyGenericClass<Car> myGenericClassObjectFore = new MyGenericClass();
        Car carOne = new Car(10);
        Car carTwo = myGenericClassObjectFore.show(carOne);
        System.out.println(carTwo);
    }
}
