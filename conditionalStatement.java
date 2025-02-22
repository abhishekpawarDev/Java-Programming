import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        int age = 22;

        if(age >= 18){
            System.out.println("eligible to Vote");
        }else{
            System.out.println("not Eligible to vote");
        }


        // switch statement 
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number (1-3): "); 

        if (inp.hasNextInt()) { 
            int day = inp.nextInt();
            
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday - Sunday");
                    break;
                default:
                    System.out.println("Enter a valid number (1-3)");
                    break;
            }
        } else {
            System.out.println("Invalid input! Please enter a number.");
        }

        inp.close();
    }
}
