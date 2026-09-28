import java.util.Scanner;

public class task22v {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = (a / b + 1) / (a / b + 1 + b / a);

        int max = a * k + b * (1 - k);

        System.out.println(max);
    }
}
