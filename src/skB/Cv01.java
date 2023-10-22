package skB;

public class Cv01 {
    public static void main(String[] args) {
        System.out.println("Hello world!"); // komentář

        int a = 10;
        int b = 5;
        int c = a + b + 3;
        System.out.println(c + 5);
        System.out.println(c);

        boolean b1 = false;
        b1 = true;
        b1 = a <= 10;
        System.out.println(b1);

        a = 20;
        b = 10;
        int temp = a;
        a = b;
        b = temp;

        a = b + a; // 30
        b = a - b; // 20
        a = a - b; // 10

        System.out.println(a + b);

        System.out.println("dělení:");
        a = 20;
        b = 10;
        System.out.println(a / b);
        System.out.println(b / a);

        double dA = 20;
        double dB = 10;
        System.out.println(dB / dA);
        System.out.println(b / dA);
        System.out.println(b / (double)a);

        double dC = b / (double) a;
        System.out.println(dC);

        String city = "Hradec Králové";
        String faculty = "FIM";

        System.out.println(city + " - " +  faculty);

        System.out.println(a +""+ b);

        System.out.print(a);
        System.out.print(a);
        System.out.println(a);

        System.out.println(a * b);

        System.out.println("Modulo: " + 11 % 2);

        int r = 5;
        int v = 10;

        System.out.println("Objem válce: " + 3.14 * r * r * v);

    }
}