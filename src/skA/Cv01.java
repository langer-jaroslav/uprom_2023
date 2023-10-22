package skA;

public class Cv01 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int a = 10;
        System.out.println(a);
        System.out.println("Ahoj " + a);

        int b = 5;
        System.out.println(a + b);
        b = 9;
        int sum = a + b;
        System.out.println(sum);

        System.out.println(a + "" + b);

        String city = "Hradec Králové";
        String university = "FIM";
        String universityName = university + " " + city;
        System.out.println(universityName);

        boolean bo = false;

        bo = true;
        System.out.println("bo = " + bo);


        System.out.println("dělení:");
        a = 20;
        b = 10;
        System.out.println(a / b);

        System.out.println(b / a);

        double dA = 20;
        double dB = 10;
        System.out.println(dB / dA);

        System.out.println(b / (double) a);

        double dC = b / (double) a;
        System.out.println(dC);

        System.out.println("modulo:");
        int mod = 12 % 2;
        System.out.println("11 % 2 = " + mod);

        a = 10;
        b = 20;
        int temp = 10;
        a = b;
        b = temp;

        a = a + b; // 30
        b = a - b; // 10
        a = a - b; // 20

        double pi;

        pi = 3.14;
        double r = 10;
        double v = 5;

        double objem = pi * r * r * v;
        System.out.println("objem V = " + objem);

        System.out.println(5 + 5 * 3);  // 20
        System.out.println((5 + 5) * 3);    // 30

    }
}