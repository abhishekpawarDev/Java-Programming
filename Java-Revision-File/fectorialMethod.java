import java.util.Scanner;

public class fectorialMethod {
    public static int factCal(int n){
        int factorial = 1;
        for(int i = n; i >= 1;i--){
            factorial = factorial * i;
        } 
        return factorial;
    }
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter Value");
        int val = value.nextInt();
        value.close();
        System.err.println(factCal(val));
    }    
}
