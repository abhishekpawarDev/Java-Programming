package JavaStrings;

public class stringMethod {
    public static void main(String[] args){
        String Std = "Akash       ";
        String Greeting = "Welcome";

        // find a lenghth of string
        System.out.println("the length of string " + Std.length());

        //concat with + operator
        System.out.println(Std +" "+ Greeting);

        //concat method 
        System.out.println(Std.concat(Greeting));

        //charAt
        System.out.println(Std.charAt(3));

        // contain Method Return a boolean value 
        System.out.println(Std.contains("sh"));

        // index of
        System.out.println(Std.indexOf("s"));

        System.out.println(Std.trim());

        System.out.println(Std.isEmpty());

        System.out.println(Std.toLowerCase());

        System.out.println(Std.toUpperCase());

    }
}
