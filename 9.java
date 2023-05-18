import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            String input = scanner.nextLine();

            switch (input) {
                case "print":
                    Collections.reverse(list);
                    for (String str : list) {
                        System.out.println(str);
                    }
                    Collections.reverse(list);
                    break;
                case "revert":
                    if (!list.isEmpty()) {
                        list.remove(list.size() - 1);
                    }
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:
                    list.add(input);
                    break;
            }
        }

        scanner.close();
    }
}