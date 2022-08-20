import java.util.*;
public class DisplayOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scn.nextInt();

        for(int i=1; i <= n; i = i + 2) {
                System.out.println(i);
        }
    }
}