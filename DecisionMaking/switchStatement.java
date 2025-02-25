package DecisionMaking;

public class switchStatement {
    public static void main(String[] args) {
        String day = "Thu";

        switch (day) {
            case "Mon":
                System.out.println("Today is Monday");
                break;
            case "Tue":
                 System.out.println("Today is Tuesday");
                 break;
            case "Wed":
                System.out.println("Today is wednesday");
                break;
            case "Thu":
                System.out.println("Today is Thrusday");
                break;
            case "Fri":
                System.out.println("Today is Friday");
                break;
            case "Sat":
                System.out.println("WOW! Today is Saturday");
                break;
            case "Sun":
                System.out.println("WOW! Today is Sunday");
            default:
                System.out.println("Enter Valid Date Example 'Mon' -- 'Fri' ");
                break;
        }
    }
}
