package OOP.inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat misCat = new Cat("tom", "black and white", "Meeaw");
        System.out.println("The name of cat is: " + misCat.name);
        System.out.println("The color is: " + misCat.color);
        System.out.println("The cat cries " + misCat.cry);

        misCat.Eat();
        //System.out.println("what food the cat eat?: " + misCat.;);
    }
}
