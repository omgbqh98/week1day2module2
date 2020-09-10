import java.util.Scanner;

public class BTinSoLuongSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input so lương prime");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        boolean check = true;
        while (count < number) {
            if (number < 2) {
                check=false;
            } else {
                int i = 2;
                while (i <= Math.sqrt(N)) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }else {
                        check=true;
                    }
                    i++;
                } if(check){
                    System.out.println(N);
                    count++;
                }N++;

            }

        }
    }
}



