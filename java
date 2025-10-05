//part A Sum of integers using autoboxing and unboxing
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // String parsing using Integer.parseInt()
                int num = Integer.parseInt(input);

                // Autoboxing: int → Integer
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer.");
            }
        }

        int sum = 0;
        // Unboxing: Integer → int
        for (Integer i : numbers) {
            sum += i;
        }

        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
