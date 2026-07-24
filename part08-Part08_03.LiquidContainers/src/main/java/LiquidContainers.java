import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    first = first + amount;
                    if (first > 100) {
                        first = 100;
                    }
                }
            }

            if (command.equals("move")) {
                if (amount > 0) {
                    int moved = amount;
                    if (moved > first) {
                        moved = first;
                    }
                    first = first - moved;
                    second = second + moved;
                    if (second > 100) {
                        second = 100;
                    }
                }
            }

            if (command.equals("remove")) {
                if (amount > 0) {
                    int removed = amount;
                    if (removed > second) {
                        removed = second;
                    }
                    second = second - removed;
                }
            }
        }
    }
}