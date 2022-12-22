package models;

public class Reader {
    private String name;
    private String faculty;
    private int ticketNum;
    private String birthday;
    private long phoneNum;


    public Reader(String name, String faculty, int ticketNum, String birthday, long phoneNum) {
        this.name = name;
        this.faculty = faculty;
        this.ticketNum = ticketNum;
        this.birthday = birthday;
        this.phoneNum = phoneNum;
    }

    public void takeBook(int takenBooks) {
        System.out.println("\n"+name + " взял книг: " + takenBooks);
    }

    public void takeBook(String[] bookName) {
        System.out.println(name + " взял: " + bookName);
    }

    public void takeBook(Book[] books ){
        System.out.print(name + " взял: ");
        for (int i = 0; i<books.length; i++) {
            System.out.print(books[i].getName()+"; ");
        }
    }

    public void returnBook(Book[] books) {
        System.out.print(name + " вернул: ");
        for (int i = 0; i<books.length; i++) {
            System.out.print(books[i].getName()+"; ");
        }
    }

    public void returnBook(int returnedBooks){
        System.out.println("\n"+name + " вернул книг: " + returnedBooks);
    }

    @Override
    public String toString() {
        return "\nФИО: " + name +
                "\nФакультет: " + faculty +
                "\nНомер билета: " + ticketNum +
                "\nДата рождения: " + birthday +
                "\nНомер телефона: " + phoneNum+"\n";
    }
}