package OOP.Encalpsulation;

// In Encapsulation we restrict our properties from the outsdie this class
// so no one is able to see what they are but can have access to them using the ones we set.

public class Student {
    private String name;
    private String address;
    private int age;

    //constructor
    public Student(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    //We provide a way for our properties to be set by whatever users wants
   public void setName(String studentName){
        this.name = studentName;
    }
    public void setAddress(String studentAddress) {
        this.address = studentAddress;
    }
    public void setAge(int studentAge){
        this.age = studentAge;
    }
    // With this method we can get the properties
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }


    public static void main(String[] args) {
       Student student = new Student("Thomas", "street minina 5", 23);
       // System.out.println("The student address is : " + student.getAddress());
        //System.out.println("The student name is : "+ student.getName());
        //System.out.println("His age is : " + student.getAge());

        Student student1 = new Student("Emma", "street maya 2" , 22);
        student1.setAddress("krasnofloskaya 2");
        student1.setAge(20);
        student1.setName("Emmanuel");

        System.out.println("The student address is : " + student1.getAddress());
        System.out.println("The student name is : "+ student1.getName());
        System.out.println("His age is : " + student1.getAge());




    }
}
