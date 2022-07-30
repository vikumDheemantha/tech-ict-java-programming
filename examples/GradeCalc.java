import java.util.Scanner;

public class GradeCalc {
    /*
    * when program runs it requests name, subject and marks from user and provide grade
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * nextBoolean()	Reads a boolean value from the user
         * nextByte()	    Reads a byte value from the user
         * nextDouble()	    Reads a double value from the user
         * nextFloat()	    Reads a float value from the user
         * nextInt()	    Reads a int value from the user
         * nextLine()	    Reads a String value from the user
         * nextLong()	    Reads a long value from the user
         * nextShort()	    Reads a short value from the user
         */
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your subject: ");
        String subject = scanner.nextLine();
        System.out.print("Please enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 50) {
            System.out.println("Hello " + name + ", you have passed the " + subject);
        } else {
            System.out.println("Hello " + name + ", sorry you have failed the " + subject + "try again !");
        }
    }
}