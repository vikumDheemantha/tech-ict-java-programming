public class ConditionalProgramming {
    public static void main(String[] args) {
        // If condition
        String name = "Nimal";
        int age = 17;

        System.out.println("hello " + name);
        if (age >= 18) {
            System.out.println("good morning");
        }

        // if else
        int marks = 68;
        if (marks >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }

        // if else if, else
        //eg: 75 - A, 65 - B, 50 - C, fail
        if (marks >= 75) {
            System.out.println("A");
        } else if (marks >= 65) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}