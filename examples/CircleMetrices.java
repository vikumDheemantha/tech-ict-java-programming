import java.util.Scanner;
public class CircleMetrices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double pi = 22.0 / 7;
        System.out.print("enter radius value: ");
        int r = scn.nextInt();
        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println("area of the circle: " + area);
        System.out.println("peremeter of the circle: " + perimeter);
    }
}