package oopsPolymorphism;


abstract class Vehicle {
    abstract void start();

    void stop() {           
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with a key.");
    }
}

public class abstractionpractice {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); 
        car.stop();  
    }
}
