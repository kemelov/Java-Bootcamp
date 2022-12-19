public class Book implements Printable{
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаем книгу "+getName());
    }

    public static void printBooks(Printable[]printables){
        for (Printable i: printables){
            if (i instanceof Book){
                i.print();
            }
        }
    }
}
