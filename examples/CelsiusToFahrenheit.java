import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("enter value from Celsius: ");
        double valueSelsius = scn.nextDouble();
        double valueFahrenheit = (valueSelsius * 9/5) + 32;
        System.out.println("value from fahrenheit is " + valueFahrenheit + " F");
    }
}