import models.Book;
import models.Reader;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Tom Sawyer", "Mark Twain");
        Book book2 = new Book("Hackleberry Finn", "Mark Twain");
        Book book3 = new Book("Тимур и его команда", "Артур Гайдар");

        Reader reader1 = new Reader("Петрухин Иван Алексеевич", "E-1-11", 233,"09.11.21", 773378235);

        System.out.println(reader1.toString());

        Book[] takenBooks = new Book[]{book1, book2, book3};
        Book[] returnedBooks = new Book[]{book1, book2};

        reader1.takeBook(takenBooks);
        reader1.takeBook(takenBooks.length);

        reader1.returnBook(returnedBooks);
        reader1.returnBook(returnedBooks.length);
    }
}
