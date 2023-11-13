package skB;

import java.util.Scanner;

public class Cv07 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        /*int n = loadNumber();
        System.out.println("číslo: " + n);*/
        //int sum = sum(loadNumber(),loadNumber());
        //double sum = sum(3.6, 5.7);

        /*
        Napište algoritmus, který vytvoří pole o
        velikosti 10 a naplní ho čísly od 1 do 10.
        */
        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        print(arr);*/

        /*
        Napište algoritmus, který vytvoří pole
        o velikosti 10 – pole naplňte čísly
        zadanými od uživatele a poté je vypište.
         */
        /*int[] arr = loadArray(10);
        print(arr);
        //print(loadArray(10));*/

        /*
        Napište algoritmus, vytvoří pole o velikosti
        definované uživatelem, poté pole naplňte
        čísly a zjistěte minimální a maximální hodnotu
        v poli včetně indexů těchto hodnot. Výsledek vypište.
         */
        /*int length = loadNumber();
        int[] arr = loadArray(length);
        int iMin = 0;
        int iMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[iMin])
                iMin = i;
            if (arr[i] > arr[iMax])
                iMax = i;
        }
        System.out.println("min arr[" + iMin + "] = " + arr[iMin]);
        System.out.println("max arr[" + iMax + "] = " + arr[iMax]);*/

        /*
        Napište algoritmus, který vytvoří pole o velikosti definované
        uživatelem, poté pole naplňte čísly a proveďte součin hodnot
        na sudých indexech. Výsledek vypište.
         */
        /*int length = loadNumber();
        int[] arr = loadArray(length);
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                result *= arr[i];
        }
        System.out.println("result: " + result);*/

        /*
        Napište algoritmus, který projde pole čísel a čísla, která
        jsou sudá vloží do pole poleSudych a lichá čísla do pole poleLichych.
        Pole vypište.
        */
        int length = loadNumber();
        int[] arr = loadArray(length);
        int evenLength = 0;
        int oddLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                evenLength++;
            else
                oddLength++;
        }
        int[] poleSudych = new int[evenLength];
        int[] poleLichych = new int[oddLength];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                poleSudych[evenCount] = arr[i];
                evenCount++;
            }
            else{
                poleLichych[oddCount] = arr[i];
                oddCount++;
            }
        }
        System.out.println("pole sudých:");
        print(poleSudych);
        System.out.println("pole lichých:");
        print(poleLichych);
    }

    public static int loadNumber() {
        System.out.println("Zadejte číslo:");
        int x = scanner.nextInt();
        return x;
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum a + b = " + sum);
        return sum;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void print(int[] arr) {
        System.out.print("array = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i + 1 < arr.length)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] loadArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = loadNumber();
        }
        return arr;
    }
}
