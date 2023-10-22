package skA;
import java.util.Scanner;

public class Cv02 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Zadej číslo");
        //int num = scanner.nextInt();
        int num = 15;
        System.out.println("Zadali jste: " + num);

        int c1 = 25;

        boolean b1 = num > c1;
        if (b1) {
            System.out.println("číslo je větší než " + c1);
        } else if (10 < num) {
            System.out.println("číslo je větší než 10");
        } else {
            System.out.println("číslo není větší než 10");
        }

        if (b1) {
            // tady se něco stane
        }

        /*
        System.out.println("Zpráva 1");
        System.out.println("Zpráva 2");
        System.out.println("Zpráva 3");
        System.out.println("Zpráva 4");
        System.out.println("Zpráva 5");
        */

        for (int i = 0; i <= 6; i++) {
            System.out.println("Zpráva " + i);
        }
        for (int i = 6; i >= 0; i--) {
            System.out.println("Zpráva " + i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }

        /*int num2 = 100;
        while (num2 >= 10) {
            System.out.println("Zadej číslo menší než 10");
            num2 = scanner.nextInt();
        }
        num = 0;
        do {
            System.out.println("Zadej číslo menší než 10");
            num2 = scanner.nextInt();
        } while (num2 >= 10);
        */


        /*System.out.println("Zadejte číslo");
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }*/

        /*
        System.out.println("výpočet faktoriálu, zadejte číslo:");
        num = scanner.nextInt();
        int sum = num;
        for (int i = 1; i < num; i++) {
            sum *= (num - i);   // sum = sum * (num - i)
        }
        System.out.println(num + "! = " + sum);
        */
        /*num = 56;
        int num2 = 0;
        System.out.println("Hádejte číslo");
        do {
            num2 = scanner.nextInt();
            if (num2 > num)
                System.out.println("Hádané číslo je menší");
            if (num2 < num)
                System.out.println("Hádané číslo je větší");
        } while (num != num2);
        System.out.println("správně");
        */

        System.out.println("fibonacci, zadejte počet:");
        num = scanner.nextInt();

        int fibonaciC1 = 0;
        int fibonaciC2 = 1;
        for (int i = 1; i < num; i++) {
            int fibonaciC3 = fibonaciC1 + fibonaciC2;
            System.out.println(fibonaciC3);

            fibonaciC1 = fibonaciC2;
            fibonaciC2 = fibonaciC3;
        }
    }
}