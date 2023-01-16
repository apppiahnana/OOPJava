package OOP.inheritance;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int startSpeed, int startGear){
       speed = startSpeed;
       gear = startGear;
    }
    public void setGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
    void applyBreak(int decrement){
        speed -= decrement;
    }
}

