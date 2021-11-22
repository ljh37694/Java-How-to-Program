import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] numbersCopy = new int[numbers.length];

        Arrays.fill(numbers, -1);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number(10~100): ");
            int num = input.nextInt();
            System.arraycopy(numbers, 0, numbersCopy, 0, numbers.length);

            Arrays.sort(numbersCopy);

            if (Arrays.binarySearch(numbersCopy, num) < 0) {
                numbers[i] = num;
            }
        }

        for (int n : numbers) {
            if (n != -1) {
                System.out.printf("%d ", n);
            }
        }
    }
}