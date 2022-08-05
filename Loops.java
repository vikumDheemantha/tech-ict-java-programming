import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // While
        /**
         * run the loop until the given condition is concluded
         */
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count ++;
        }

        System.out.print("enter new value: ");
        int value = scanner.nextInt();

        while (value % 2 == 0 ) {
            System.out.println("value is even number");
            System.out.print("enter another  value: ");
            value = scanner.nextInt();
        }


        do {
            System.out.println("value is even number");
            System.out.print("enter value: ");
            value = scanner.nextInt();
        } while (value % 2 == 0);

        // For
        for(int i=25; i<=100; i = i + 2) {
            System.out.println("value: " + i);
        }
    }
}