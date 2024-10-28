package Object_class;
class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price: $" + price);
    }
}
public class Book_program {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        System.out.println("Details of Default Book:");
        defaultBook.displayDetails();

        System.out.println();

        Book parameterizedBook = new Book("1984", "George Orwell", 9.99);
        System.out.println("Details of Parameterized Book:");
        parameterizedBook.displayDetails();
    }
}