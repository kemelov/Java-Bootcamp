import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox("Яблоко", 5.9);
        HeavyBox heavyBox3 = new HeavyBox("Апельсины", 6.5);
        HeavyBox heavyBox2 = new HeavyBox("Персики", 4.8);

        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>(Arrays.asList(heavyBox1, heavyBox2, heavyBox3));

        for (HeavyBox h : heavyBoxes) {
            System.out.printf("Название ящика: %s\nВес: %.1f\n\n", h.getName(), h.getWeight());
        }


        System.out.println("----Изменить вес первого ящика на 1----\n");
        heavyBoxes.set(0, new HeavyBox(heavyBoxes.get(0).getName(), 1.0));
        for (HeavyBox h : heavyBoxes) {
            System.out.printf("Название ящика: %s\nВес: %.1f\n\n", h.getName(), h.getWeight());
        }


        System.out.println("----Удалить последний ящик----\n");
        heavyBoxes.remove(2);
        for (HeavyBox h : heavyBoxes) {
            System.out.printf("Название ящика: %s\nВес: %.1f\n\n", h.getName(), h.getWeight());
        }


        System.out.println("----Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль----\n");
        System.out.println("способ №1 Object toArray\n");
        HeavyBox[] arr = heavyBoxes.toArray(new HeavyBox[0]);
        for (HeavyBox h : arr) {
            System.out.printf("Название ящика: %s\nВес: %.1f\n\n", h.getName(), h.getWeight());
        }

        System.out.println("способ №2  T[] toArray(T[] a\n");
        HeavyBox[] arr2 = new HeavyBox[heavyBoxes.size()];
        arr2 = heavyBoxes.toArray(arr2);
        for (HeavyBox h : arr2) {
            System.out.printf("Название ящика: %s\nВес: %.1f\n\n", h.getName(), h.getWeight());
        }

        System.out.println("способ №3   get() \n");
        HeavyBox[] arr3 = new HeavyBox[heavyBoxes.size()];
        for (int i=0; i<heavyBoxes.size(); i++){
            arr3[i] = heavyBoxes.get(i);
        }

        for (HeavyBox h : arr2) {
            System.out.printf("Название ящика: %s\nВес: %.1f\n\n", h.getName(), h.getWeight());
        }

        System.out.println("----Удалить все ящики----\n");
        heavyBoxes.removeAll(heavyBoxes);
        for (HeavyBox h : heavyBoxes) {
            System.out.printf("Название ящика: %s\nВес: %.1f\n\n", h.getName(), h.getWeight());
        }
    }
}