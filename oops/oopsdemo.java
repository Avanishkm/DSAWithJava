package oops;

class Student{
    // final String name = "Avanish"; // cannot assign a value to final variable you are fix the value
    String name;
    int roll_no;
    String address;
    void printName(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(address);
    }
    void add(){
        System.out.println(2+2);
    }
}

class Dog{
    String name;
    int license_id;
    public void eat(){
        System.out.print(name+" eats!");
    }
}
public class oopsdemo {
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "Rahul";
        std.name = "Rajesh";
        std.roll_no = 15;
        std.address = "new delhi";
        std.printName();
        std.add();

        Dog dog1 = new Dog();
        dog1.name = "Bruno";
        dog1.eat();
    }
}
