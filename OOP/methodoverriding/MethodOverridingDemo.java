package com.methodoverriding;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(50, 25);
        System.out.println("The bicycle speed is: " + bicycle.speed);
        System.out.println("The bicycle gear is: " + bicycle.gear);

        //applying some speed
        bicycle.applySpeed(25);
        System.out.println("The speed after increasing speed: " + bicycle.speed);

        //applying brake
        bicycle.applyBrake(30);
        System.out.println("The speed after decreasing speed: " + bicycle.speed);

        //Now let's create an object for MountainBike
        Bicycle mountainBike = new MountainBike(70, 70, 5);
        System.out.println("The mountainBike speed is: " + mountainBike.speed);
        System.out.println("The mountainBike gear is: " + mountainBike.gear);
        //System.out.println("The mountainBike startHeight is: " + mountainBike.seatHeight);

        //applying speed
        mountainBike.applySpeed(5);
        System.out.println("The speed after increasing: " + mountainBike.speed);

        //applying brake
        mountainBike.applyBrake(20);
        System.out.println("The speed after decreasing: " + mountainBike.speed);


    }
}
