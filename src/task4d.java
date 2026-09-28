import java.util.Scanner;

public class task4d {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b%a;
        System.out.println(c);
    }
}