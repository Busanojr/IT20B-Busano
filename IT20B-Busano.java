    package Queue;
    import java.util.LinkedList;
    import java.util.Queue;

    public class SimpleQueueExample {

        public static void main(String[] args) {

            Queue<String> queue = new LinkedList<>();

            queue.add("Apple");
            queue.add("Banana");
            queue.add("Cherry");

            queue.poll();  
            queue.poll();  

            System.out.println("Remaining elements in the queue: " + queue);  

            queue.add("Date");
            queue.add("Eggplant");

            queue.poll(); 

            System.out.println("Remaining elements in the queue: " + queue);
        }
    }
