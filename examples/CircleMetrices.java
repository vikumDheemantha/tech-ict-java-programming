import java.util.Scanner;

public class CircleMetrices {

    static double pi = 22.0 / 7;

    public static double areaCalcCircle(int radius) {
        double area = pi * radius * radius;
        return area;
    }

    public static String areaCalcRect(String unit, int width, int height) {
        int area = width * height;
        return area + " " + unit;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter radius value: ");

        int h = scn.nextInt();
        int w = scn.nextInt();
        String u = scn.nextLine();

        String rectArea = areaCalcRect(u, w, h);

        int r1 = scn.nextInt();
        int r2 = scn.nextInt();
        int r3 = scn.nextInt();
        int r4 = scn.nextInt();
        double area = pi * r1 * r1;
        double perimeter = 2 * pi * r1;

        System.out.println("area of the circle: " + area);
        System.out.println("peremeter of the circle: " + perimeter);
    }
}