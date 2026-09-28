import java.util.Scanner;

public class task11k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int totalMinutesInDay = 24 * 60; // 1440

        int minutesToday = n % totalMinutesInDay;

        int hours = minutesToday / 60;
        int minutes = minutesToday % 60;

        System.out.println(hours + " " + minutes);

        scanner.close();
    }
}