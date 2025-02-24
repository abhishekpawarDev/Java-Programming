package javaMethod;

public class newjavaMethod {

    //non static method 
    public int sum(int a , int b){
        int sum = a + b;
        return sum;
    }

    // non static method this keyword
        int x = 22;
        int y = 23;
        public int valueTell(int x){
            System.out.println("value is " + this.x);
            return this.x;
        }
        // this keyword print x = 22 value 

        // function without using this keyword
        public int valueTell1(int y){
            System.out.println("value is " + y);
            return y;
        }
    public static void main(String[] args) {
        newjavaMethod m1 = new newjavaMethod();
        int sum1 = m1.sum(10, 11);
        System.out.println(sum1);

        newjavaMethod obj = new newjavaMethod();
        obj.valueTell(212);
        obj.valueTell1(545);
    }
}
