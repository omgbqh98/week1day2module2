import java.util.Scanner;

public class THtimUocChungLonNhat {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        Scanner scanner =new Scanner(System.in);
        System.out.println("input number one");
        numberOne =scanner.nextInt();
        System.out.println("input number two");
        numberTwo =scanner.nextInt();
        numberOne=Math.abs(numberOne);
        numberTwo=Math.abs(numberTwo);
        if(numberOne==0||numberTwo==0){
            System.out.println("ko co uoc chung");
        }
        while (numberTwo != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberTwo - numberTwo;

            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        System.out.println("uoc chung lon nhat: " + numberOne);

    }
}
