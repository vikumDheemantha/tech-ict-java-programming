import java.util.*;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int i = 1;
        int[] arr = {6, 7, 34, 6, 3, 7, 8, 45, 68, 78};

        Scanner scn = new Scanner(System.in);
        while(i == 1) {
            try {
                System.out.print("input number1:");
                int num1 = scn.nextInt();
                System.out.print("input number2:");
                int num2 = scn.nextInt();
                System.out.print("input number3:");
                int num3 = scn.nextInt();
                int ans = num1 / num2;
                System.out.println("answer is: " + ans);
                System.out.println("read from array: " + arr[num3]);
            } catch (Exception e) {
                System.out.println("message: " + e.getMessage());
                e.printStackTrace();
            }
            System.out.print("do you want to continue (yes = 1, no = 0): ");
            i = scn.nextInt();
        }
    }
}