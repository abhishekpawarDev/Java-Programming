public class casting {
    public static void main(String[] args) {
        //Implicit (Widening) Casting
        int price = 100;
        int finalPrice = price + (int)18.00;
        System.out.println(finalPrice);

        double p = 100.00;
        int fp = (int)p + 18;
        System.out.println(fp);

        // Explicit (Narrowing) Casting
        int cash = 100;
        double gstCash = cash + 12.23;
        System.out.println(gstCash);
    }
}
