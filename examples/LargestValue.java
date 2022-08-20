import java.util.Scanner;
public class LargestValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scn.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scn.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scn.nextInt();
        
        int largest;
        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("Largest value: " + largest);
    }
}