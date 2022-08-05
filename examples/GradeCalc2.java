import java.util.Scanner;

class GradeCalc2 {
    public static void main(String[] args) {
        // initiate scanner
        Scanner scanner = new Scanner(System.in);

        // input all values
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Plesae enter marks: ");
        int marks = scanner.nextInt();

        // logic, calculation

        char grade = 'F';
        if (marks >= 75) {
            grade = 'A';
        } else if (marks >= 65) {
            grade = 'B';
        } else if (marks >=55) {
            grade = 'C';
        } else if (marks >= 35) {
            grade = 'S';
        } else {
            grade = 'F';
        }

        // output
        System.out.println("Hello " + name + ", your grade is " + grade);
    }
}