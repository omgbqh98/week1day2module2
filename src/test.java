import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input String:");
        String str = scanner.nextLine();
        System.out.println(number + str);
    }
}
