import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<Integer>();

    // add elements
    List.add(0);
    List.add(1);
    List.add(2);
    List.add(3);

    System.out.println(List);
    int element = List.get(2);
    System.out.println(element);

    // add element in between
    List.add(1,5);
    
    System.out.println(List);

    //set element
    List.set(0,7 );
    
    System.out.println(List);

    //delete element
    List.remove(4);
    System.out.println(List);

    // fint lenth
    System.out.println(List.size());;

    //loop

    for(int i = 0; i < List.size(); i++){
        System.out.println(List.get(i));
    }

    // sorting

    Collections.sort(List);
    System.out.println(List);
    
    }
}
