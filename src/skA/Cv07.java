package skA;

import java.util.Scanner;

public class Cv07 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        //int n = loadNumber();

        //System.out.println("sum: " + sum(loadNumber(), loadNumber()));
        //double sum = sum(2.5,3.5);

        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);*/

        /*
        Napište algoritmus, který vytvoří pole o velikosti 10
        – pole naplňte čísly zadanými od uživatele a poté vypište hodnoty
         */
        /*int[] arr = loadArray(10);
        printArray(arr);*/

        /*
        Napište algoritmus, vytvoří pole o velikosti definované
        uživatelem, poté pole naplňte čísly a zjistěte minimální a maximální
        hodnotu v poli včetně indexů těchto hodnot. Výsledek vypište.
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
        uživatelem, poté pole naplňte čísly a proveďte součin, součet
        a počet čísel v poli. Výsledek vypište.
         */
        /*int length = loadNumber();
        int[] arr = loadArray(length);
        int soucin = 1;
        int soucet = 0;
        for (int i = 0; i < arr.length; i++) {
            soucin *= arr[i];
            soucet += arr[i];
        }
        System.out.println("Součin: " + soucin);
        System.out.println("Součet: " + soucet);
        System.out.println("Počet: " + arr.length);*/


        /*
        Napište algoritmus, který vytvoří pole o velikosti definované
        uživatelem, poté pole naplňte čísly a proveďte součet hodnot
        na lichých indexech, které jsou sudé a zároveň dělitelné 5.
        Výsledek vypište
         */
        /*int length = loadNumber();
        int[] arr = loadArray(length);
        int soucet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1 && arr[i] % 2 == 0 && arr[i] % 5 == 0)
                soucet += arr[i];
        }
        System.out.println("Součet: " + soucet);*/
        /*
        Napište algoritmus, který projde pole čísel a čísla, která jsou sudá
        vloží do pole poleSudych a lichá čísla do pole poleLichych.
        Výsledek vypište.
         */
        /*int length = loadNumber();
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
        printArray(poleSudych);
        System.out.println("pole lichých:");
        printArray(poleLichych);*/
    }

    public static int loadNumber() {
        System.out.println("Zadejte číslo");
        int x = scanner.nextInt();
        return x;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    private static void printArray(int[] arr) {
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
        for (int i = 0; i < length; i++) {
            arr[i] = loadNumber();
        }
        return arr;
    }
}
