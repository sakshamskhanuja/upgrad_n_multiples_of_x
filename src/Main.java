import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Scans the number.
        int n = scanner.nextInt();

        // Scans how many required multiples.
        int x = scanner.nextInt();

        // Stores 1.
        int start = 1;

        while (start <= x) {
            System.out.println(n * start);
            start++;
        }
    }
}