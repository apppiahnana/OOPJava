package OOP.Interfaces;

class MountainBike implements Bicycle{
    private String seatHeight;
    private int speed;
    private String gear;

    MountainBike(String seatHeight, int startSpeed, String startGear){
        this.gear = startGear;
        this.seatHeight = seatHeight;
        this.speed = startSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public void setSeatHeight(String seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public void applySpeed(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;

    }
}
