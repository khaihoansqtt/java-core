import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {
    private int id;
    private String name, author, publisher;
    private int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book b) {
        if (this.id > b.id) {
            return 1;
        } else if (this.id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author
                + ", publisher=" + publisher + ", quantity=" + quantity + "]";
    }

}

public class Main {
    private static  String query = "WITH input_names AS ( " +
            "  SELECT :priceListName AS name " +
            "  FROM UNNEST(CAST(:priceListNames AS VARCHAR[])) priceListName " +
            ") " +
            "SELECT in.name, CASE WHEN pl.price_list_name IS NOT NULL THEN TRUE ELSE FALSE END " +
            "FROM input_names in " +
            "LEFT JOIN price_list pl ON in.name = pl.price_list_name AND pl.vendorId = :vendorId";
    public static void main(String[] args) {

//        Queue<String> names = new PriorityQueue<String>();
//
//        // offer(E): Thêm phần tử vào hàng đợi (queue).
//        // Trả về true nếu thêm thành công.
//        // Trả về false nếu hàng đợi không còn chỗ.
//        names.offer("E");
//        names.offer("A");
//        names.offer("M");
//
//        // add(E): Thêm một phần tử vào hàng đợi (queue).
//        // Trả về true nếu thành công.
//        // Ném ra một Exception nếu hàng đợi đã đầy.
//        names.add("G");
//        names.add("B");
//        for (String b : names) {
//            System.out.println(b);
//        }
//
////        while (true) {
////            // poll(): Lấy ra và loại bỏ phần tử đầu tiên ra khỏi hàng đợi.
////            // Trả về null nếu không còn phần tử nào trong hàng đợi.
////            String name = names.poll();
////            if (name == null) {
////                break;
////            }
////            System.out.println("Name=" + name);
////        }

        Queue<Book> queue = new PriorityQueue<Book>();
        // Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
//        Book b4 = new Book(110, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        // Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
//        queue.add(b4);
        System.out.println("Traversing the queue elements:");
        // Traversing queue elements
        for (Book b : queue) {
            System.out.println(b);
        }
        System.out.println("After removing one book record:");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
//        System.out.println(queue.poll());
    }
}
