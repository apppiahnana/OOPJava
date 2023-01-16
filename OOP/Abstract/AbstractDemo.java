package OOP.Abstract;

public class AbstractDemo {
    public static void main(String[] args) {
       Animal eagle = new Bird();
        eagle.eat();
        eagle.cry();

        Animal lion = new Lion();
        lion.eat();
        lion.cry();
    }
}
