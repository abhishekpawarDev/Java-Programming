package Constructors;

public class multipleConstructor {
    public multipleConstructor(){
        System.out.println("You Call Non Perameter Constructor ");
    }
    public multipleConstructor(int a ){
        System.out.println("The value of perameter is " + a);
    }
    public static void main(String[] args) {
        multipleConstructor f1 = new multipleConstructor();
        multipleConstructor f2 = new multipleConstructor(1);
    }
}
