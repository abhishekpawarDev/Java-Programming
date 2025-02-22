import java.util.Scanner;

public class inputMethod{
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.print("Enter any suggestion: "); 
        String sugg = txt.nextLine();
        System.out.println("Your suggestion: " + sugg);
        txt.close(); 
    }
}
