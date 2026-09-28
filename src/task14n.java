import java.util.Scanner;

public class task14n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int totalLessonMinutes = n * 45;

        int shortBreaks = (n / 2) * 5;

        int longBreaks = ((n - 1) / 2) * 15;

        int totalMinutes = totalLessonMinutes + shortBreaks + longBreaks;

        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);

        scanner.close();
    }
}
