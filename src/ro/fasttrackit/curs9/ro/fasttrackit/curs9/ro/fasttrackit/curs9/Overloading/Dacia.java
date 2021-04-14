package ro.fasttrackit.curs9.polymorphism;

import ro.fasttrackit.curs9.ro.fasttrackit.curs9.polymorphism.Car;

public class Dacia extends Car {

    @Override
    public void drive(int speed, int gear) {
        System.out.println("Driving in Dacia... ce sa faci?");
    }
}
