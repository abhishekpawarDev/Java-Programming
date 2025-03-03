public class arraysPractice {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 12;
        arr[1] = 13;
        arr[2] = 14;
        System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        int marks[] = {88 , 84 , 45 , 45 , 98 ,99};

        for(int x = 0; x < marks.length; x++){
            System.out.println(marks[x]);
        }

        System.out.println("lenghth of array is  " + marks.length);
    }
}
