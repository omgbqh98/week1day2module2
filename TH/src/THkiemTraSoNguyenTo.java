import java.util.Scanner;

public class THkiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number want check");
        int number = scanner.nextInt();
boolean check =true;
        if(number<2){
            check = false;
        }else {
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if(number%i==0){
                    check = false;

                }else {
                    check =true;

                }
        }
        }
        if(check){
            System.out.println(number+" is prime");
        }else {
            System.out.println(number+" not prime");
        }
        }
    }


