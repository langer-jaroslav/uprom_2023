package skC;

import java.util.Scanner;

public class Cv02 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        /*System.out.println("Zadejte číslo");
        int num = scanner.nextInt();
        System.out.println("Zadal jste: " + num);

        boolean cond = num > 10;

        if (cond) {
            System.out.println("číslo je větší než 10");
            //todo
        } else if (num > 0) {
            System.out.println("číslo je větší než 0");
        } else {
            System.out.println("číslo není větší než 0");
        }*/

        /*System.out.println("Zpráva 0");
        System.out.println("Zpráva 1");
        System.out.println("Zpráva 2");
        System.out.println("Zpráva 3");*/

        /*for (int i = 1; i <= 10; i++) {
            System.out.println("Zpráva " + i);
            // todo
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Zpráva " + i);
        }*/

        /*int num = 0;
        while (num < 100) {
            System.out.println("zadejte číslo");
            num += scanner.nextInt();
        }
        System.out.println("součet " + num + " splnilo podmínku > 100");*/

        /*int num = 100;
        do {
            System.out.println("zadejte číslo");
            num += scanner.nextInt();
        } while (num < 100);
        System.out.println("součet " + num + " splnilo podmínku > 100");*/

        /*System.out.println("Zadejte číslo n pro výpočet faktoriálu:");
        // 5! = 5 * 4 * 3 * 2
        int n = scanner.nextInt();
        int sum = n;
        for (int i = 1; i < n; i++) {
            sum *= (n - i);   // sum = sum * (num - i)
        }
        System.out.println(n + "! = " + sum);

        //varianta 2
        sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(n + "! = " + sum);*/

        /*int num = 56;
        int usersInput = 0;
        System.out.println("Hádejte číslo");
        do {
            usersInput = scanner.nextInt();
            if (usersInput > num)
                System.out.println("Hádané číslo je menší");
            if (usersInput < num)
                System.out.println("Hádané číslo je větší");
        } while (num != usersInput);
        System.out.println("správně");*/

        //matice 5x8
        /*System.out.println("matice NxM");
        System.out.println("zadejte N");
        int n = scanner.nextInt();
        System.out.println("zadejte M");
        int m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }*/

        System.out.println("fibonacci, zadejte počet:");
        int num = scanner.nextInt();

        int fibonaciC1 = 0;
        int fibonaciC2 = 1;
        for (int i = 1; i <= num; i++) {
            int fibonaciC3 = fibonaciC1 + fibonaciC2;
            System.out.println(fibonaciC3);

            fibonaciC1 = fibonaciC2;
            fibonaciC2 = fibonaciC3;
        }
        // varianta 2
        fibonaciC1 = 0;
        fibonaciC2 = 1;
        for (int i = 1; i <= num; i++) {
            fibonaciC2 = fibonaciC1 + fibonaciC2;
            fibonaciC1 = fibonaciC2 - fibonaciC1;
            System.out.println(fibonaciC2);
        }
    }
}