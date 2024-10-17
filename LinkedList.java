package midterm;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
    
        LinkedList<String> animals = new LinkedList<>();
        animals.add("dodo");
        animals.addFirst("lizard");  
        animals.addLast("johnson");  
        animals.add(1, "dragon");      

        System.out.println("Linked List Original: " + animals);
        System.out.println("Size of the Linked List: " + animals.size());

        if (animals.contains("Lion")) {
            System.out.println("The list contains 'Lion'.");
        } else {
            System.out.println("The list does not contain 'Lion'.");
        }
        boolean containsLion = animals.contains("Lion");
        System.out.println("Does the list contain 'Lion'? " + containsLion);
    }
}
