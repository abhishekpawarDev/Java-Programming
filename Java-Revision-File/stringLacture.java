import java.util.Scanner;

public class stringLacture {
    public static void main(String[] args) {
        String name = "Abhishek";
        String fname = "Abhishek Pawar";
        System.out.println("Hello My Name is " + name + "and " + fname + " is my full name  ");

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter Name");
        String userName = inputName.next();
        inputName.close();
        System.out.println("Welcome ! " + userName + "in java world");

        String firstName = "Abhishek";
        String lastName = "Pawar";
        System.out.println(firstName.concat(lastName));

        System.out.println("Lenghth of name chracter is " + name.length());

        //charAt
        for(int i = 0; i < name.length();i++){
            System.out.println(name.charAt(i));
        }

        // compare
        System.out.println(name.compareTo(fname));

        //if string1 > string2 ----> positive value
        //if string1 == string2 ----> zero
        //if string1 > string2 ----> negative value


        System.out.println(fname.substring(0,8));
    }
}
