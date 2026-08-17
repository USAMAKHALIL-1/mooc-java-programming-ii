public class CD implements Packable {
    private String artist;
    private String name;
    private int publication_year;
    private double weight;

    public CD(String artist, String name, int publication_year) {
        this.artist = artist;
        this.name = name;
        this.publication_year = publication_year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;

    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publication_year + ")";
    }
}
