
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input >= 0) {
                sum = sum + input;
                count++;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }
    }
}
