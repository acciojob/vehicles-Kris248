package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
                Vehicle v = new Vehicle();
        Car c = new Car();
        F1 f = new F1();

        v.displayInfo();
        c.displayInfo();
        f.displayInfo();

        Boat b = new Boat("Speed Boat", 6);
        System.out.println("Boat Name: " + b.getVehicleName());
        System.out.println("Boat Capacity: " + b.getVehicleCapacity());
    }
    }
}
