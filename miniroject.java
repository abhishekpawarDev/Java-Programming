import java.util.Scanner;

public class miniroject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = -1;
        do {
            System.out.println("Guess My Number");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("Correct");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your Number Is Large");
            } else {
                System.out.println("Your Number is small");
            }
        } while (userNumber >= 0);
        System.out.println("My Number Was " + myNumber);
        sc.close(); 
    }
}
