import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //input using scanner 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Welcome World" );

        //nextInt
        //nextFloat
        //next Double 
        //nextfloat
        sc.close();
    }
}
