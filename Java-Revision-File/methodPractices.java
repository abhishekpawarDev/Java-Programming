import java.util.Scanner;

public class methodPractices {
    public static void printMyName(String name){
        System.out.println("Hello " + name + " Welcome Java Cource ");
        return;
    }
    public static void main(String[] args) {
        Scanner iv = new Scanner(System.in);
        System.out.println("Enter You Name");
        String Name = iv.nextLine();
        iv.close();
        printMyName(Name);
    }
}
