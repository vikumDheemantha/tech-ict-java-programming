import java.util.*;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        int i = 1;
        Scanner scn = new Scanner(System.in);
        while(i == 1) {
            try {
                System.out.print("input number1:");
                int num1 = scn.nextInt();
                System.out.print("input number1:");
                int num2 = scn.nextInt();
                int ans = num1 / num2;
                System.out.println("answer is: " + ans);
            } catch (Exception e) {
                System.out.println("--- you cannot devide by 0 ---");
            }
            System.out.print("do you want to continue (yes = 1, no = 0): ");
            i = scn.nextInt();
        }
    }
}