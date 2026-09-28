import java.util.Scanner;

public class task12l {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int totalSecondsInDay = 24 * 3600;

        int secondsToday = n % totalSecondsInDay;

        int hours = secondsToday / 3600;
        int minutes = (secondsToday % 3600) / 60;
        int seconds = secondsToday % 60;

        System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);

        scanner.close();
    }
}
