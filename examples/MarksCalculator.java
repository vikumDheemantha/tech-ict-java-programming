import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {

        // read mars from user
        Scanner scn = new Scanner(System.in);
        System.out.print("Number of students: ");
        int count = scn.nextInt();
        int[] marks = new int[count];
        for (int i=0; i < count; i++) {
            System.out.print("enter marks of student" + (i+1) + ": ");
            marks[i] = scn.nextInt();
        }

        // calculate
        int max = 0;
        for (int mark: marks) {
            if(mark > max) {
                max = mark;
            }
        }

        System.out.println("maximum mark is: " + max);

    }
}