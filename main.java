import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Shubham");
        list.add("Rohit");
        list.add("Aman");

        System.out.println("LinkedList: " + list);

        list.addFirst("First-Node");
        list.addLast("Last-Node");

        System.out.println("After adding first and last: " + list);

        list.remove("Rohit");
        System.out.println("After removing Rohit: " + list);
    }
}

