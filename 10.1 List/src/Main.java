import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 6 чисел по порядку");
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i<6; i++){
            int input = scanner.nextInt();
            if (!arrayList.contains(input)) {
                arrayList.add(input);
            }
        }

        for (Integer i : arrayList) {

            System.out.print(i+", ");
        }


    }
}