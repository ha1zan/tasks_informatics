import java.util.Scanner;

public class task7g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int tens = n / 10;

        System.out.println(tens);

        scanner.close();
    }
}