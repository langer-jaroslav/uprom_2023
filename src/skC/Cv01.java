package skC;

public class Cv01 {
    public static void main(String[] args) {
        System.out.println("Hello world!");  // komentář

        int a = 5;
        a = 10;
        System.out.println(a);

        int b = 20;
        System.out.println(a + b);

        int c = a + b;
        System.out.println("Součet: " + c);

        String vysledek = "Součet a + b = " + c;
        System.out.println(vysledek);

        a = 20;
        b = 10;
        System.out.println("Dělení");
        System.out.println("a / b = " + a / b);
        System.out.println("b / a = " + b / a);

        System.out.println("double:");
        double dA = 20;
        double dB = 10;
        System.out.println(dB / dA);
        System.out.println(b / 20d);
        System.out.println(b / (double) a);
        double vysledek2 = b / (double) a;
        System.out.println(vysledek2);
        double vysledek3 = (double) b / a;

        int moduloVysledek = 11 % 2;

        String city = "Hradec";
        String university = "FIM";
        String joinedString = university + " - " + city;
        System.out.println(joinedString);

        // V = pi * r^2 * v
        //double pi = 3.14;
        int r = 6;
        int v = 10;

        double vysledekValec = 3.14d * (r * r) * v;
        double vysledekValec2 = (r * r * v) * 3.14d;
        System.out.println(vysledekValec);
        System.out.println(vysledekValec2);

        boolean b1 = false;
        b1 = true;

        a = b;

        b1 = 10 == 10;
        b1 = a == b;
        b1 = a != b;
        b1 = a > b;

        a = 10;
        b = 20;
        int temp = a;
        a = b;
        b = temp;

        a = 10;
        b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }
}