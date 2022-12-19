public class Magazine implements Printable{
    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
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
        System.out.println("Печатаем журнал "+getName());
    }

    public static void printMagazines(Printable[]printables){
        for (Printable i: printables){
            if (i instanceof Magazine){
                i.print();
            }
        }
    }
}
