import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordHashMap;

    public DictionaryOfManyTranslations() {
        this.wordHashMap = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.wordHashMap.putIfAbsent(word, new ArrayList<>());
        this.wordHashMap.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.wordHashMap.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        if (this.wordHashMap.get(word) != null) {
            this.wordHashMap.remove(word);
        }
    }
}
