
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String entry : hashmap.keySet()) {
            System.out.println(entry);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        Iterator<String> it = hashmap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (key.contains(text)) {
                System.out.println(key);
            }
        }

        // Or we can use the for each loop that is easier and identical by performance, just above one is the same the java doing behind the scene
        // for (String key : hashmap.keySet()) {
        // if (key.contains(text)) {
        // System.out.println(key);
        // }
        // }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        Iterator<String> it = hashmap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

}
