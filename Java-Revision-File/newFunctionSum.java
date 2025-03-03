import java.util.Scanner;

public class newFunctionSum {
    public static int sumVal(int x , int y){
        int sum =  x + y;
        return sum;
    }
    public static void main(String[] args) {
    
        Scanner inumber = new Scanner(System.in);
        System.out.println("Enter Two Values");
        int a = inumber.nextInt();
        int b = inumber.nextInt();
        inumber.close();
        System.out.println(sumVal(a, b));
    }
}
