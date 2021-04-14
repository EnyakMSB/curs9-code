package ro.fasttrackit.curs9.ro.fasttrackit.curs9.polymorphism;

public class Car {
    private int speed;
    private int gear;

    public Car() {
        this.gear = 0;
        this.speed = 0;
    }

    public void drive(int speed, int gear) {
        setSped(speed);
        setGear(gear);
        System.out.println("driving with speed " + speed + " in gear " + gear);
    }

    protected void setSped(int speed) {
        this.speed = speed;
    }

    protected void setGear(int gear) {
        this.gear = gear;
    }
}
