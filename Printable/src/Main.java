public class Main {
    public static void main(String[] args) {
        Printable book1 = new Book("Исповедь");
        Printable book2 = new Book("История Кыргызстана в цифрах");
        Printable book3 = new Book("Азбука");
        Printable magazine1 = new Magazine("People");
        Printable magazine2 = new Magazine("Vogue");
        Printable magazine3 = new Magazine("Glamour");
        Printable[] printer = new Printable[]{book1,book2, book3, magazine1, magazine2, magazine3};

        Book.printBooks(printer);
        Magazine.printMagazines(printer);
    }
}
