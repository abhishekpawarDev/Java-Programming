import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50 , 25 , 35 , 45};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(numbers[4]);

        // 2d array
        int[][] finalMarks = {{120 , 485 , 565},{565 , 465 , 455}};
        System.out.println(finalMarks[1][2]);
    }
}
