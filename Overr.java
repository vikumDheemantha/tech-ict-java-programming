public class Overr {

    public String testing(String a) {
        System.out.println("Hello "+a);
        return a;
    }

    public int testing(String a, String b) {
        System.out.println("Hello "+a + " " + b);
        return 10;
    }

    public static void main(String[] args) {
        Overr o = new Overr();
        String a = "a";
        String b = "b";
        int x = o.testing(a, b);
        System.out.println(x);
        o.testing(a);
    }
}