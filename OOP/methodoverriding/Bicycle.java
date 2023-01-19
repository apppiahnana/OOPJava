package com.methodoverriding;

public class Bicycle {
    protected int speed;
    protected int gear;

    //constructor
    public Bicycle(int bikeSpeed, int bikeGear){
        this.gear = bikeGear;
        this.speed = bikeSpeed;
    }
    public void applySpeed(int increment){
        speed += increment;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }

}
