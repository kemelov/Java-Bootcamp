import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Афанасий", 5);
        Cat cat2 = new Cat("Боб", 3);
        Cat cat3 = new Cat("Матроскин", 3);
        Cat cat4 = new Cat("Киса", 5);
        Cat cat5 = new Cat("Феня", 4);
        Cat cat6 = new Cat("Гарфилд", 3);
        Cat cat7 = new Cat("Мышоед", 4);
        Cat cat8 = new Cat("Лев", 2);
        Cat cat9 = new Cat("Павел", 6);
        Cat cat10 = new Cat("Дрын", 1);

        HashMap<String, Cat> hashMap = new HashMap<>();
        hashMap.put(cat1.getName(), cat1);
        hashMap.put(cat2.getName(), cat2);
        hashMap.put(cat3.getName(), cat3);
        hashMap.put(cat4.getName(), cat4);
        hashMap.put(cat5.getName(), cat5);
        hashMap.put(cat6.getName(), cat6);
        hashMap.put(cat7.getName(), cat7);
        hashMap.put(cat8.getName(), cat8);
        hashMap.put(cat9.getName(), cat9);
        hashMap.put(cat10.getName(), cat10);

        Set<Map.Entry<String, Cat>> entrySet = hashMap.entrySet();

        for (Map.Entry<String, Cat> entry : entrySet){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }

        System.out.println("\n----Реализуйте все известные вам методы HashMap----");
        
        System.out.println("---containsKey---");
        System.out.println(hashMap.containsKey("Матроскин")+"\n");

        System.out.println("---containsValue---");
        System.out.println(hashMap.containsValue(cat3)+"\n");

        System.out.println("---get---");
        System.out.println(hashMap.get("Матроскин")+"\n");

        System.out.println("---isEmpty---");
        System.out.println(hashMap.isEmpty()+"\n");

        System.out.println("---remove---");
        hashMap.remove("Мышоед");
        System.out.println("--Кот Мышоед удален из списка--");
        for (Map.Entry<String, Cat> entry : entrySet){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }

        System.out.println("\n---size---");
        System.out.println(hashMap.size());
    }
}
