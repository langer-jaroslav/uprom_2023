package skC;


import java.util.Arrays;
import java.util.Scanner;

public class Cv10 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        /*
        Napište metodu, která přijímá pole celých čísel a vrací jejich součet.
         */
        /*int[] arr = new int[] {3,4,8,9,10,15,28};
        System.out.println("Suma: " + sum(arr));*/

        /*
        Napište metodu, která přijímá pole a vrátí největší prvek v něm.
         */
        /*int[] arr = new int[] {3,4,8,9,10,15,28};
        int maxVal = max(arr);
        System.out.println("Max: " + maxVal);*/

        /*
        Napište metodu, která přijímá pole a vrací nové pole
        s obráceným pořadím prvků.
         */
        /*int[] arr = new int[] {3,4,8,9,10,15,28};
        Utils.print(arr);
        Utils.print(reverse(arr));*/

        /*
        Napište metodu, která přijímá pole čísel a vrátí true,
        pokud je pole seřazené vzestupně, a false jinak.
        */
        /*int[] arr = new int[] {3,4,8,9,10,15,28};
        System.out.println("Seřazeno: " + isAsc(arr));*/

        /*
        Napište metodu, která přijímá pole čísel
        a specifické číslo a vrátí true, pokud toto
        číslo je obsaženo v poli, a false jinak.
        */
        /*int[] arr = new int[] {3,4,8,9,10,15,28};
        System.out.println("Pole obsahuje číslo 10: " + contains(arr, 10));*/

        /*
        Napište metodu, která přijímá pole čísel
        a vrací nové pole obsahující pouze sudá čísla
        z původního pole.
        */
        /*int[] arr = new int[] {3,4,8,9,10,15,28};
        Utils.print(arr);
        Utils.print(even(arr));*/

        /*
        Napište metodu, která přijímá pole čísel
        a dva indexy, a poté prohodí hodnoty
        na těchto dvou indexech v poli.
         */
        int[] arr = new int[] {3,4,8,9,10,15,28};
        Utils.print(arr);
        Utils.print(swap(arr, 2, 5));
    }
    private static int[] swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;

        /*arr[a] += arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] -= arr[b];*/
        return arr;
    }
    private static int[] even(int[] arr){
        int count = 0;
        for (int item : arr) {
            if (item % 2 == 0)
                count++;
        }
        int[] evenArray = new int[count];
        count = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evenArray[count] = item;
                count++;
            }
        }
        return evenArray;
    }

    private static boolean contains(int[] arr, int c) {
        for (int item : arr) {
            if (item == c)
                return true;
        }
        return false;
    }

    private static boolean isAsc(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
    private static int[] reverse(int[] arr){
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }
        return reversedArr;
    }
    private static int max(int[] arr){
        int max = arr[0];
        for (int item : arr) {
            if (item > max)
                max = item;
        }
        //max = Arrays.stream(arr).max().getAsInt();
        return max;
    }
    private static int sum(int[] arr){
        int sum = 0;
        /*for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }*/
        for (int item : arr) {
            sum += item;
        }
        //sum = Arrays.stream(arr).sum();
        return sum;
    }
}
