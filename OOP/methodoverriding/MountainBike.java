package com.methodoverriding;

public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int startHeight, int bikeSpeed, int bikeGear) {
        super(bikeSpeed, bikeGear);
        //this sets the seat seatHeight
        seatHeight = startHeight;
    }
    // Here all the methods are overriding from base class Bicycle and adding its own implementation
    @Override
    public void applySpeed(int increment) {
        speed = speed + increment + 12;
    }
    public void applyBrake(int decrement){
        speed = speed - decrement - 10;
    }

}
