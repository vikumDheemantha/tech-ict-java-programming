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

        int monthValue = 8;
        String monthText = "";

        switch (monthValue) {
            case 1:
                monthText = "Jan";
                // code block
                break;
            case 2:
                monthText = "Feb";
                break;
            case 3:
                monthText = "Mar";
                break;
            case 4:
                monthText = "Apr";
                break;
            case 5:
                monthText = "May";
                break;
            case 6:
                monthText = "Jun";
                break;
            case 7:
                monthText = "Jul";
                break;
            case 8:
                monthText = "Aug";
                break;
            case 9:
                monthText = "Sep";
                break;
            case 10:
                monthText = "Oct";
                break;
            case 11:
                monthText = "Nov";
                break;
            case 12:
                monthText = "Dec";
                break;
            default:
                monthText = "N/A";
        }

        System.out.println("your month is "+ monthText);
    }

}