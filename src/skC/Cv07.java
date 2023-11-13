package skC;

import java.util.Scanner;

public class Cv07 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        //int n = loadNumber();
        //System.out.println("suma: " + sum(5,8));
        //System.out.println("suma: " + sum(5.8,8.9));

        /*
        Napište algoritmus, který vytvoří pole o velikosti 10
        a naplní ho čísly od 1 do 10.
         */
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        print(arr);*/

        /*
        Napište algoritmus, který vytvoří pole o velikosti 10 – pole
        naplňte čísly zadanými od uživatele a poté vypište hodnoty.
        */
        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = loadNumber();
        }
        print(arr);*/

        /*
        Napište algoritmus, vytvoří pole o velikosti definované
        uživatelem, poté pole naplňte čísly a zjistěte
        minimální a maximální hodnotu v poli včetně indexů těchto hodnot.
        Výsledek vypište.
        */
        /*int length = loadNumber();
        int[] arr = new int[length];
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = loadNumber();
            if (arr[i] < arr[iMin])
                iMin = i;
            if (arr[i] > arr[iMax])
                iMax = i;
        }
        System.out.println("min: arr[" + iMin + "] = " + arr[iMin]);
        System.out.println("max: arr[" + iMax + "] = " + arr[iMax]);*/

        /*
        Napište algoritmus, který vytvoří pole o velikosti definované
        uživatelem, poté pole naplňte čísly a proveďte součet hodnot
        na lichých indexech, které jsou sudé a zároveň dělitelné 5.
         */
        /*int length = loadNumber();
        int[] arr = new int[length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = loadNumber();
            if (arr[i] % 2 == 0 && i % 2 == 1 && arr[i] % 5 == 0)
                sum += arr[i];
        }
        System.out.println("sum: " + sum);*/


        /*
        Napište algoritmus, který projde pole čísel a čísla, která jsou
        sudá vloží do pole poleSudych a lichá čísla do pole poleLichych.
        Výsledeky vypište.
         */
        int[] arr = {1, 8, 16, 28, 37, 14, 2, 7, 9};
        int sudyPocet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sudyPocet++;
        }
        int[] poleSudych = new int[sudyPocet];
        int[] poleLichych = new int[arr.length - sudyPocet];
        int counterSudych = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                poleLichych[i - counterSudych] = arr[i];
                continue;
            }
            poleSudych[counterSudych] = arr[i];
            counterSudych++;
        }
        print(poleSudych);
        print(poleLichych);


    }

    private static int loadNumber() {
        System.out.println("Zadejte číslo:");
        int n = scanner.nextInt();
        return n;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i + 1 < arr.length)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
