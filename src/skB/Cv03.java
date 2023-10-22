package skB;

import java.util.Scanner;

public class Cv03 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        // Načtěte dvě čísla, vypiště které je větší, případně zda se rovnají
        /*System.out.println("Zadejte 2 čísla");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if(num1 > num2)
            System.out.println("První číslo je větší");
        else if(num1 == num2)
            System.out.println("Čísla jsou stejná");
        else
            System.out.println("Druhé číslo je větší");*/

        // Načítat čísla dokud se neobjeví -1, po té vypsat min a max
        /*int num = 0, min = 0, max = 0;
        do {
            num = scanner.nextInt();
            if (num < min && num != -1)
                min = num;
            if (num > max)
                max = num;
        } while (num != -1);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);*/

        // Načíst 5 čísel, která se sečtou a v případě že se objeví 0, tak skončit
        /*int sum = 0;
        for (int i = 0; i < 5; i++) {
            int in = scanner.nextInt();
            if(in == 0)
                break;
            sum += in;
        }
        System.out.println("Suma: " + sum);*/

        // Načíst 5 čísel, která se vynásobí
        /*int sum = 1;
        for (int i = 0; i < 5; i++) {
            int in = scanner.nextInt();
            if (in == 0)
                continue;
            sum *= in;
        }
        System.out.println("Suma: " + sum);*/
        /*while (true){
            int in = scanner.nextInt();
            if(in == 0)
                break;
        }*/

        // Načítejte čísla, dokud se nezadá -1, na konci vypsat sumu sudých čísel
        /*int sumEven = 0;
        while (true){
            int in = scanner.nextInt();
            if(in == -1)
                break;
            if(in % 2 == 1)
                continue;
            sumEven += in;
        }
        System.out.println("Suma sudých: " + sumEven);*/

        /*int sumEven = 0;
        int in = 0;
        do {
            in = scanner.nextInt();
            if (in % 2 == 0)
                sumEven += in;
        } while (in != -1);
        System.out.println("Suma sudých: " + sumEven);*/


        // uživatel zadá číslo, vypíšeme od mínusu do plusu dané číslo
        /*int in = scanner.nextInt();
        for (int i = -in; i <= in; i++)
            System.out.println(i);*/

        // zadáme číslo a vypíšeme malou násobilku
        /*int in = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(i * in);*/

        // načteme číslo od uživatele in, vypíšeme prvočísla do této hodnoty
        int in = scanner.nextInt();
        for (int i = 2; i <= in; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }
    }
}
