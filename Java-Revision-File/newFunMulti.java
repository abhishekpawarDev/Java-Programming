import java.util.Scanner;

public class newFunMulti {
    public static int TwoValMultiply(int a , int b){
        int multi = a*b;
        return multi;
    }
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter Two Number For Multiply");
        int firstValue = inputValue.nextInt();
        int secondValue = inputValue.nextInt();
        inputValue.close();

        System.out.println("Multiplication of Two Values is  " + TwoValMultiply(firstValue, secondValue));
    }
    
}
