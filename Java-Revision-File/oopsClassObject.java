class pen {
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
}
class Student {
    String name;    
    int age;
    
    public void printInfo(){
        System.out.println("Hello " + name + " You are " + age + " Year Old");
    }
}

public class oopsClassObject {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color ="blue";
        p1.type ="gel";

        p1.write();

        Student s1 = new Student();
        s1.name = "John";
        s1.age = 32;
        s1.printInfo();


    }    
}

