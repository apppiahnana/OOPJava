package OOP.inheritance;
class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike (int startHeight, int startSpeed, int startGear){
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }
   public void setSeatHeight(int newValue){
        this.seatHeight = newValue;
    }
}
