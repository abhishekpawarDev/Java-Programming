import java.util.Scanner;

public class PrintWorldProject {
    public static void main(String[] args) {
        System.out.println("Enter digit which time print word");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        sc.close();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + ") Hello World");
        }
    }
}
