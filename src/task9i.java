import java.util.Scanner;

public class task9i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        int sum = a + b + c;

        System.out.println(sum);

        scanner.close();
    }
}
