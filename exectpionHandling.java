public class exectpionHandling {
    public static void main(String[] args) {
        try {
            int[] marks = {98 , 95 , 94};
            System.out.println(marks[4]);
        } catch (Exception e) {
            System.out.println("somthing wrong");
        }
        System.out.println("hello How are You");
    }
}
