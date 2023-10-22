package skB;

import java.util.Scanner;

public class Cv02 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        /*System.out.println("Zadejte číslo:");
        int num = scanner.nextInt();
        System.out.println("Zadali jste: " + num);

        boolean cond = num > 10;
        System.out.println(cond);
        if (cond) {
            System.out.println("zadali jste číslo větší než 10");
        } else if (num > 0) {
            System.out.println("zadali jste číslo větší než 0");
        } else {
            System.out.println("zadali jste číslo není větší než 0");
        }
        if(cond){
            // tady se něco stane
        }
        */

        /*System.out.println("Zpráva 0");
        System.out.println("Zpráva 1");
        System.out.println("Zpráva 2");
        System.out.println("Zpráva 3");*/

        for (int i = 0; i <= 5; i++) {
            System.out.println("Zpráva " + i);

            // může tady toho být víc
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println("Zpráva " + i);

            // může tady toho být víc
        }

        /*System.out.println("matice n*m");
        System.out.println("zadejte n:");
        int n = scanner.nextInt();
        System.out.println("zadejte m:");
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }*/

        /*int num = 10;
        while (num > 5) {
            System.out.println(num);
            num--;
        }*/

        /*System.out.println("zadajte čísla, dokud nebude součet > 100");
        int sum = 0;
        while (sum <= 100){
            sum += scanner.nextInt();
        }
        System.out.println("už je víc než 100");*/

        /*System.out.println("zadajte čísla, dokud nebude součet > 100");
        int sum = 101;
        do {
            sum += scanner.nextInt();
        } while (sum <= 100);
        System.out.println("už je víc než 100");*/

        /*System.out.println("výpočet faktoriálu, zadejte číslo:");
        int num = scanner.nextInt();
        int sum = num;
        for (int i = 1; i < num; i++) {
            sum *= (num - i);   // sum = sum * (num - i)
        }
        System.out.println(num + "! = " + sum);*/

        /*int num = 56;
        int usersInput = 0;
        System.out.println("Hádejte číslo");
        do {
            //int usersInput = scanner.nextInt();
            if (usersInput > num)
                System.out.println("Hádané číslo je menší");
            if (usersInput < num)
                System.out.println("Hádané číslo je větší");
        } while (num != usersInput);
        System.out.println("správně");*/

        System.out.println("fibonacci, zadejte počet:");
        int num = scanner.nextInt();

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