package com.generic.genericTestTwo;

// subclass
public class Car {
    // class Car(child) extends ((inherits)) from the class Vehicle(parent)
    // Classes that inherit from an abstract class must implement all the abstract methods of that class unless they themselves are an abstract class.

    public String[] passengers;
    private int numberOfCylinders;

    // It is a constructor
    public Car(int numberOfCylinders) {
        // super : The super constructor calls the parent class
//        super();
//        super(20);
        super();
        // super : The super constructor calls the parent class

        this.numberOfCylinders = numberOfCylinders;
    }

    public Car(int numberOfCylinders, String[] passengers) {
        this.numberOfCylinders = numberOfCylinders;
        this.passengers = passengers;
    }
    // It is a constructor

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
