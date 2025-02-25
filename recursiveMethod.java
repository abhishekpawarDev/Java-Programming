public class recursiveMethod{
    public int fact(int n) {
        if (n == 1) {
            return 1;  
        } else {
            return n * fact(n - 1);  
        }
    }

    public static void main(String[] args) {
        recursiveMethod obj = new recursiveMethod(); 
        int result = obj.fact(5);  
        System.out.println("Factorial of 5: " + result); 
    }
}
