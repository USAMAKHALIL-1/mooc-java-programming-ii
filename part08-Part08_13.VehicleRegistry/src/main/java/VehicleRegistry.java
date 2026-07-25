import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehiclehashmap;

    public VehicleRegistry() {
        vehiclehashmap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehiclehashmap.get(licensePlate) == null) {
            vehiclehashmap.put(licensePlate, owner);

            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return vehiclehashmap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehiclehashmap.get(licensePlate) == null) {
            return false;
        }
        System.out.println("the" + vehiclehashmap.get(licensePlate) + "has been deleted");
        vehiclehashmap.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate i : vehiclehashmap.keySet())
            System.out.println(i);
    }

    public void printOwners() {
        HashSet<String> areadyprinted = new HashSet<>();
        for (String i : vehiclehashmap.values()) {
            if (areadyprinted.add(i)) {
                System.out.println(i);
            }
        }
    }
}
