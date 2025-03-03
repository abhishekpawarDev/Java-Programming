package oopsPolymorphism;

public class methodoverloadingpra {
    public void info(String name){
        System.out.println("Hello " + name);
    }
    public void info(int age){
        System.out.println("Your Age is " + age);
    }
    public void info(String name , int age){
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        methodoverloadingpra o1 = new methodoverloadingpra();
        o1.info(21);
        o1.info("Abhishek");
        o1.info("Abhishek" , 21);
    }
}
