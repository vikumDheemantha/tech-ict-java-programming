import java.util.Scanner;
public class SumCalculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        System.out.println("sum is: " + sum);
    }
}