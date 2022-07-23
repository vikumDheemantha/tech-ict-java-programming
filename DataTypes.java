public class DataTypes {
    public static void main(String[] args) {
        /* Number Types */

        // Integer Types
        byte byteValue; // (-128, 127)
        byteValue = 100;
        System.out.println(byteValue);
        short shortValue;// (-32,768, 32,767)
        int intValue; // -2,147,483,648 to 2,147,483,647
        long longValue = 3409583L; // -9223372036854775808 to 9223372036854775807

        // Ploting point types
        float floatValue = 23.45f; // 7 decimal digits
        double doubleValue = 15.14d; // 15 decimal digints

        // boolean type
        boolean booleanValue = true;
        booleanValue = false;

        /* Character data type */
        char grade = 'B';
        String passFail = "Pass";

        /* Type Casting */

        // Widening caseting
        // byte -> short -> int -> long -> float -> double
        byteValue = 120;
        System.out.println(byteValue);
        intValue = byteValue;
        System.out.println(intValue);
        longValue = intValue;
        System.out.println(longValue);
        longValue = byteValue;
        System.out.println(longValue);

        // Narrowing Casting
        longValue = 112398L;
        byteValue = (byte) longValue;
        System.out.println(byteValue);
        doubleValue = 45.65;
        System.out.println(doubleValue);
        intValue = (int) doubleValue;
        System.out.println(intValue);


        // 14, 23,42,356, 98374598347, 123.456, 3456.234233
        byte x = 14;
        int y = 2342356;
        long z = 98374598347L; // 9.8374598347 x 10^10
        float fl = 123.456f;
        float fl2 = 3456.234233f;

        double xd = x;
        double yd = y;
        double zd = z;
        double fld = fl;
        double fld2 = fl2;

        System.out.println();
        System.out.println(xd);
        System.out.println(yd);
        System.out.println(zd);
        System.out.println(fld);
        System.out.println(fld2);

        int xi = (int) x;
        int yi = (int) y;
        int zi = (int) z;
        int fli = (int) fl;
        int fli2 = (int) fl2;
        System.out.println();
        System.out.println(xi);
        System.out.println(yi);
        System.out.println(zi);
        System.out.println(fli);
        System.out.println(fli2);

        int sum = x + y;
        System.out.println(sum);
    }
}