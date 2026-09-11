import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az első számot: ");
        int a = scanner.nextInt();

        System.out.print("Add meg a második számot: ");
        int b = scanner.nextInt();

        System.out.println("Az összeg: " + (a + b));

        scanner.close();
    }
}