import java.util.Scanner;

public class THthietKeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0: next");
        System.out.println("input select your: ");
        System.out.println("menu:");
        System.out.println("1:ve hinh thap");
        System.out.println("2: ve hinh vuong");
        System.out.println("3: ve hinh chu nhat");

        int select = scanner.nextInt();
        while (true) {
            System.out.println("input select your: ");
             select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("ve hinh thap: ");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    break;
                case 2:
                    System.out.println("ve hinh vuong: ");
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    break;
                case 3:
                    System.out.println("ve hinh chu nhat");
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choid");
            }

        }

    }
}
