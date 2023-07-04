import java.util.Scanner;
import java.io.*;

public class StandardStreams {
    public static void main(String[] args) {
//        try {
//            InputStreamReader isr = new InputStreamReader(System.in);
//            BufferedReader br = new BufferedReader(isr);
//            System.out.print("Enter your name: ");
//            String name = br.readLine();
//            System.out.println("name: " + name);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("this will print new line");
        System.out.println("this will print new line2");

        System.out.print("this will print but not reach to new line, ");
        System.out.println("this will print new line2");
        String name = "Vihanga";
        System.out.printf("hi, %s. How are you. your mark is %f%n", name, 89.50);
        System.err.println("This is error message");
    }
}