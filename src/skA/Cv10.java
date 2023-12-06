package skA;

import java.util.Scanner;

public class Cv10 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        /*
        Napište metodu, která přijímá pole celých čísel a vrací jejich součet.
         */
        /*int[] arr = new int[]{5, 6, 8, 9, 10, 15};
        int result = sum(arr);
        System.out.println("Výsledek je " + result);*/
        /*
        Napište metodu, která přijímá pole a vrátí největší prvek v něm.
         */
        /*int[] arr = new int[]{5, 6, 8, 9, 10, 15};
        int result = max(arr);
        System.out.println("Výsledek je " + result);*/
        /*
        Napište metodu, která přijímá pole a vrací nové pole
        s obráceným pořadím prvků.
         */
        /*int[] arr = new int[]{5, 6, 8, 9, 10, 15};
        Util.printArray(arr);
        Util.printArray(Util.reverse(arr));*/
        /*
        Napište metodu, která přijímá pole čísel a vrátí true,
        pokud je pole seřazené vzestupně, a false jinak.
         */
        /*int[] arr = new int[]{5, 6, 8, 9, 10, 15};
        System.out.println(isAsc(arr));*/

        /*
        Napište metodu, která přijímá pole čísel
        a specifické číslo a vrátí true, pokud toto
        číslo je obsaženo v poli, a false jinak.
         */
        /*int[] arr = new int[]{5, 6, 8, 9, 10, 15};
        System.out.println(contains(arr, 8));*/


        /*
        Napište metodu, která přijímá pole čísel
        a vrací nové pole obsahující pouze sudá čísla
        z původního pole.
         */
        /*int[] arr = new int[]{5, 6, 8, 9, 10, 15};
        Util.printArray(even(arr));*/

        /*
        Napište metodu, která přijímá pole čísel
        a dva indexy, a poté prohodí hodnoty
        na těchto dvou indexech v poli.
         */
        int[] arr = new int[]{5, 6, 8, 9, 10, 15};
        Util.printArray(arr);
        Util.printArray(swap(arr, 1, 4));
    }

    private static boolean isAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    private static boolean contains(int[] arr, int a) {
        for (int item : arr) {
            if (item == a)
                return true;
        }
        return false;
    }

    private static int[] even(int[] arr) {
        int count = 0;
        for (int item :
                arr) {
            if (item % 2 == 0)
                count++;
        }
        int[] evenArray = new int[count];
        count = 0;
        for (int item :
                arr) {
            if (item % 2 == 0) {
                evenArray[count] = item;
                count++;
            }
        }
        return evenArray;
    }

    private static int[] swap(int[] arr, int a, int b) {
        arr[a] += arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] -= arr[b];
        return arr;
    }
}
