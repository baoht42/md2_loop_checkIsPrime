import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int inputNum = sc.nextInt();
        boolean check = true;
        if (inputNum < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(inputNum)) {
                if (inputNum % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        if (check){
            System.out.println(inputNum + " is a Prime");
        }else {
            System.out.println(inputNum + " is not a Prime" );
        }
    }
}