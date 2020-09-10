import java.util.Scanner;

public class BTthietkemenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0: next");
        System.out.println("input select your: ");
        System.out.println("menu:");
        System.out.println("1:ve hinh chu nhat");
        System.out.println("2: ve hinh tam giac");
        System.out.println("3: ve hinh tam giac nguoc ");

        int select = scanner.nextInt();
        while (true) {
            System.out.println("input select your: ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    for (int i=0;i<3;i++){
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <=6 ; i++) {
                        for (int j = 1; j<i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                    }
                    break;
                case 3:
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i <5 ; i++) {
                        for (int j = 1; j <=5-i ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <=2*i-1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choid");
            }
        }
    }
}