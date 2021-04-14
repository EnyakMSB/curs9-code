package ro.fasttrackit.curs9.ro.fasttrackit.curs9.polymorphism;

public class BMW extends Car {
    @Override
    public void drive(int speed, int gear) {
        setGear(gear + 1);
        setSped(speed - 10);
        System.out.println("driving cu mana peste geam " + speed + " in gear " + gear);
    }

}
