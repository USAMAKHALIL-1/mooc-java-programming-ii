
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LicensePlate)) {
            return false;
        }
        LicensePlate comparedobjPlate = (LicensePlate) object;
        if (this.country.equals(comparedobjPlate.country) && this.liNumber.equals(comparedobjPlate.liNumber)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        char[] array = liNumber.toCharArray();
        int firstnum = array[array.length - 3];
        int secondnum = array[array.length - 2];
        int thirdnum = array[array.length - 1];

        return firstnum * secondnum * thirdnum;
    }

}
