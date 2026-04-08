
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {

        // Declaring a ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        /* => Methods : add(), get(), remove(), clear(),
                        addFirst(), addLast(), contains(),
                        removeFirst(), removeLast(), 
                        getFirst(), getLast(), size(),
                        Collections.reverse() .
            */ 

        
        // Add Element to ArrayList
        // Add Element to ArrayList Using Index
        // Get Element using Index
        // Remove Element
        // Clear ArrayList
        // Add an Element at starting Position 
        // Add an Element at Ending Position
        // Check Element Found in ArrayList or Not
        // Size of an ArrayList
        // To Reverse a ArrayList
        
        al.add(10);
        al.add(1, 20);
        System.out.print(al.get(1) + " ");
        al.remove(1);
        System.out.println(al);
        al.addFirst(50);
        al.addLast(100);
        al.contains(10);
        al.size();
        Collections.reverse(al);
        System.out.println(al);
        al.clear();
            
    }
}
