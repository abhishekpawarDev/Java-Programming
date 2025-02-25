package DecisionMaking;

//nested if else and if else ladder
public class nestedIfElseStatement {
     public static void main(String[] args) {
        int x = 12;
        int y = 11;
        if(x > y){
            System.out.println("X is Lager");
            if(x % 2 == 0){
                System.out.println("x is even");
            }else{
                System.out.println("X is odd ");
            }
        }else if(x < y){
            System.out.println("Y is Larger");
            if(y % 2 == 0){
                System.out.println("Y is Even ");
            }else{
                System.out.println("Y is Odd");
            }
        }else{
            System.out.println("Both Are Same");
            if (y % 2 == 0){
                System.out.println("Borth is Even");
            }else{
                System.out.println("Both is Odd");
            }
        }
     }
}
