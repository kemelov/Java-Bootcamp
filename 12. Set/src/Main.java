import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> harvest = new HashSet<>();
        harvest.add("арбуз");
        harvest.add("банан");
        harvest.add("вишня");
        harvest.add("груща");
        harvest.add("дыня");
        harvest.add("ежевика");
        harvest.add("женьшень");
        harvest.add("земляника");
        harvest.add("ирис");
        harvest.add("картофель");

        System.out.println(new TreeSet(harvest));
    }
}
