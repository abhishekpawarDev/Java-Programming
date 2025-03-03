import java.util.HashSet;

public class HashingClass {
    public static void main(String[] args) {
        // create
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);

        // serch 
        System.out.println(set.contains(2));

        //remove
        set.remove(3);
        System.out.println(set);

        //size
        System.out.println(set.size());

        //loop
        for(int item:set){
            System.out.println(item);
        }
        
    }
}