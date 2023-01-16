package OOP.inheritance;

 class Cat extends Animal {
    public Cat(String name, String color, String cry) {
        super(name, color,cry);
    }
    void Eat(){
        System.out.println("The cat eats meat!");
    }
}
