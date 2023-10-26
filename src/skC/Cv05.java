package skC;

import java.util.Scanner;

public class Cv05 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        /*int num = 10;
        boolean b = num > 10 || (num < 100 && num % 2 == 0);
        if (b) {
        }
        if(num > 10){
            if(num < 100){
                if(num % 2 == 0){
                    // tady
                }
            }
        }
        if(num>10 && num < 100 & num % 2 ==0){
        }*/

        /*
        Napište algoritmus, který z 6 zadávaných čísel vypíše první
        číslo, které je sudé a zároveň menší než 10.
        */
        /*int num = -1;
        for (int i = 0; i < 6; i++) {
            int in = scanner.nextInt();

            if (num != -1)
                continue;

            if (in % 2 == 0 && in < 10)
                num = in;
        }
        if(num == -1)
            System.out.println("Nenalezeno");
        else
            System.out.print("První sudé a menší než 10: " + num);*/

        /*
        Napište algoritmus, kde uživatel bude zadávat 13 čísel a algoritmus
        zjistí, kolik z čísel končilo nulou.
        */
        /*int count = 0;
        for (int i = 0; i < 13; i++) {
            int in = scanner.nextInt();
            if (in % 10 == 0)
                count++;
        }
        System.out.println("0 končilo : " + count + " čísel");*/

        /*Napište algoritmus, který bude načítat od uživatele 10 čísel
        a bude provádět součin každého druhého čísla.*/

        /*int result = 1;
        for (int i = 0; i < 10; i++) {
            int in = scanner.nextInt();
            if(i % 2 == 1)
                result *= in;
        }
        System.out.println("Result: " + result);*/

        /*Napište algoritmus, který bude načítat 6 čísel, vypíše
        počet sudých, lichých a z těchto výsledků zjistí zbytek po celočíselném
        dělení. (sudé : liché)
        Př. 1, 20, 31, 81, 9, 10 => 2 sudé, 4 liché => 2
        */
        /*int odds = 0;
        int evens = 0;
        for (int i = 0; i < 6; i++) {
            int in = scanner.nextInt();
            if (in % 2 == 0)
                odds++;
            else
                evens++;
        }
        System.out.println("Odds: " + odds + " Evens: " + evens);
        System.out.println(odds + " % " + evens + " = " + (odds % evens));*/

        /*
        Napište algoritmus, který bude načítat čísla dokud uživatel nezadá
        záporné číslo. Algoritmus bude provádět součet nebo součin
        hodnot – hodnoty, které uživatel zadal jako liché (1., 3., 5. apod.),
        tak budou sčítány – hodnoty, které zadal jako sudé (2., 4., 6. apod.)
        budou násobeny.*/

        /*int result = 0;
        int in = scanner.nextInt();
        int i = 1;
        while (in >= 0) {
            if (i % 2 == 1)
                result += in;
            else
                result *= in;
            i++;
            in = scanner.nextInt();
        }
        System.out.println("Result: " + result);*/


        /*Napište algoritmus, který podle zadaného počtu kreditů
        a roku studia řekne, jestli je možné pokračovat do
        dalšího ročníku. (40 na rok)*/

        /*System.out.println("Zadejte ročník");
        int year = scanner.nextInt();
        System.out.println("Zadejte počet kreditů");
        int credits = scanner.nextInt();

        if (year * 40 <= credits)
            System.out.println("Passed");
        else
            System.out.println("Failed");*/


        // Jaký je výsledek následujícího algoritmu
        /*int a = 3;      // a = 3
        int b = a++;    // b = 3; a = 4
        int c = ++b;    // c = 4; b = 4
        c = a + c;      // c = 8
        a = 5;          // a = 5
        b = c / b;      // b = 2
        System.out.println("a: " + a + "; b: " + b + "; c: " + c);*/

        /*
        Načtěte od uživatele 2 celá čísla m a n.
        Tato čísla udávají velikost generované matice
        (m – počet řádků, n – počet sloupců).
        Vypište danou matici.
        Vypisujte pořadí buňky a indexy m a n.
        ve formátu {pořadí}.{m},{n}

        Př m=3;n=4
         1.1,1   2.1,2    3.1,3   4.1,4
         5.2,1   6.2,2    7.2,3   8.2,4
         9.3,1  10.3,2   11.3,3  12.3,4
        */
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int counter = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (counter < 10)
                    System.out.print(" ");
                System.out.print(counter + "." + i + "," + j);
                System.out.print(" ");

                counter++;
            }
            System.out.println();
        }

    }
}
