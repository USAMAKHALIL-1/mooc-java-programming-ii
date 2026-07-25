import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageHashMap;

    public StorageFacility() {
        storageHashMap = new HashMap<>();
    }

    public void add(String unit, String item) {

        this.storageHashMap.putIfAbsent(unit, new ArrayList<>());
        this.storageHashMap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storageHashMap.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.storageHashMap.get(storageUnit) != null) {
            if (this.storageHashMap.get(storageUnit).size() == 1) {
                this.storageHashMap.remove(storageUnit);

            } else {
                this.storageHashMap.get(storageUnit).remove(item);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.storageHashMap.keySet());
    }
}
