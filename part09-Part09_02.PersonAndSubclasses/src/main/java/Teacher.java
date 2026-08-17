public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int num) {
        super(name, address);
        salary = num;
    }

    public String toString() {
        return super.toString() + "\n  " + "salary " + this.salary + " euro/month";

    }
}
