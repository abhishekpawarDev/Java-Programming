import java.util.LinkedList;

public class LinklistedPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.addFirst("Mango");
        list.addLast("Grapes");

        list.remove("Banana");
        list.removeFirst();

        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Last Element: " + list);

        System.out.println("LinkedList Elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

