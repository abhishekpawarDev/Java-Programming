package Constructors;

public class typeofconstructor {
    int a ;
    public typeofconstructor(int m){
        a = m;
        System.out.println("value of a is " + a);
    }
    public static void main(String[] args) {
        typeofconstructor f1 = new typeofconstructor(10000);     
    }
}
