package replitProjects.OOP8_BookShelf;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setTitle("the the YoLu YET");
        System.out.println(book1.getTitle());
        Book book2 = new Book(1234, "Dervis b UlUDAG", "hayAt HikayesI", 320);
        System.out.println(book2.toString());



    }
}
