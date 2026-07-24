import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (amount > 0) {
                    int moved = amount;
                    if (moved > first.contains()) {
                        moved = first.contains();
                    }
                    first.remove(moved);
                    second.add(moved);
                }
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}