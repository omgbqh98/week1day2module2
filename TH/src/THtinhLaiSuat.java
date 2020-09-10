import java.util.Scanner;

public class THtinhLaiSuat {
    public static void main(String[] args) {
        double money;
        int month;
        double rate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input money :");
         money = scanner.nextDouble();
        System.out.println("input month");
         month = scanner.nextInt();
        System.out.println("input rate: ");
         rate = scanner.nextDouble();
//         rate = money * (6/100)/12 * money;
    double total =0;
        for (int i = 0; i < month; i++) {
            total += money *(rate/100)/12*month;
        }
        System.out.println("tổng money: "+ total);
    }

}
