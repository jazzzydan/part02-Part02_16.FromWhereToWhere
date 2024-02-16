
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int whereTo = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from? ");
        int whereFrom = Integer.valueOf(scanner.nextLine());

        // for (*introducing a variable*; *condition*; *increasing the counter*) {
        // Functionality to be executed
        // }
        for (int i = whereFrom; i <= whereTo; i++) {
            System.out.println(i);
        }
    }
}
