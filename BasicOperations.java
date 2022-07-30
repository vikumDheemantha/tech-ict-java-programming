public class BasicOperations {
    public static void main(String[] args) {
        // Assignment operation
        int x = 15;
        int y = 15;

        // Arithmetic Operations
        // addition (+)
        int sum = x + y;
        // substraction (-)
        int sub = y-x;
        int multi = x * y;
        int dev = y / x;

        // increment and decrement
        x++; // increment
        y--; // decrement
        int modul = 47 % 5;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(dev);
        System.out.println(modul);

        // Comparison Operators
        int p, q, r;
        p = 15;
        q = 15;
        r = 13;
        double pd = 15.0;
        String ps = "15";

        boolean equals = (p == q);
        System.out.println("is p equals to q: " + equals);
        boolean qrEquals = (q == r);
        System.out.println("is q equals to r: " + qrEquals);
        boolean ppdEquals = (p == pd);
        System.out.println("p equals to pd: " + ppdEquals);

        // boolean ppsEquals = (p == ps);
        // System.out.println("p equals to ps: " + ppsEquals);

        // Not equals
        boolean notEqualsPQ = p != q;
        System.out.println("is p not equals to q: "+ notEqualsPQ);
        boolean notEqualsPR = p != r;
        System.out.println("is P not Equals to R: " + notEqualsPR);

        // greater than or less than
        boolean pGreaterThanR = p > r; // for the less than just replace the > to <
        boolean pGreaterThanQ = p > q;

        System.out.println("p is greater than r: " + pGreaterThanR);
        System.out.println("p is greater than q: " + pGreaterThanQ);

        boolean pGreaterThanOrEqualsToQ = p >= q;
        System.out.println(" p is greater than or equals to q: " + pGreaterThanOrEqualsToQ);

        // logical operations
        // logical operations only works with booleans.
        boolean a = true;
        boolean b = true;
        boolean c = false;
        // AND (&&)
        boolean aAndB = a && b;
        boolean aAndC = a && c;
        System.out.println("a and b: "+aAndB);
        System.out.println("a and c: "+aAndC);

        // AND (||)
        boolean aOrB = a || b;
        boolean aOrC = a || c;
        System.out.println("a or b: "+aOrB);
        System.out.println("a or c: "+aOrC);

        // Not (!)
        boolean notA = !a;

        // p equals q and p equals r
        boolean pqrEquals = (p == r) && (p == q);
        System.out.println("pqr Equals: "+ pqrEquals);

    }
}