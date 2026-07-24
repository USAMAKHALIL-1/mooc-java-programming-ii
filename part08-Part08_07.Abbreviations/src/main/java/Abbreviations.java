import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbrevation;

    public Abbreviations() {
        this.abbrevation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbrevation.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbrevation.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbrevation.get(abbreviation);
    }
}
