package OOP.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(23, 45, 10);
        System.out.println("The gear is: " + bike.gear);
        System.out.println("The speed is: " + bike.speed);
        System.out.println("The seatHeight is: " + bike.seatHeight);

        //calling a method
        bike.applyBreak(2);
        System.out.println("The bike speed after apply break: " + bike.speed);


    }
}
