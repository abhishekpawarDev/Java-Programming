public class multipleClasses {
    public static void main(String[] args) {
        secondClass s1 = new secondClass();
        s1.sf();
        System.out.println(s1.a);
        System.out.println(s1.b);
    }
}

class secondClass {
    int a = 10;
    int b = 20;
    void sf(){
        System.out.println("Second class attach Sucessfully");
    }
}