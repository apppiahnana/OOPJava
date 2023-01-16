package OOP.inheritance;

public class Animal {
    protected String name;
    protected String color;
    protected String cry;
    public Animal(String name, String color,String cry){
        this.name = name;
        this.color = color;
        this.cry = cry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }
}
