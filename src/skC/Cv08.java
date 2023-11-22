package skC;

import java.util.Scanner;

public class Cv08 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        /*
        Napište algoritmus, který od uživatele bude načítat N čísel
        a bude je ukládat do pole a.
        Sudá čísla bude replikovat do pole b
         */
        /*
        int length = loadNumber();
        int[] arrA = new int[length];
        int[] arrB = new int[length];
        int counterB = 0;
        for (int i = 0; i < arrA.length; i++) {
            int n = loadNumber();
            arrA[i] = n;
            if(n % 2 == 0){
                arrB[counterB] = n;
                counterB++;
            }
        }
        print(arrA);
        print(arrB);
        */

        /*
        Napište algoritmus, který od uživatele bude načítat N čísel a bude je
        ukládat do pole a. Zadané hodnoty bude replikovat do pole b kromě hodnot
        větších než 35, které bude ukládat do pole c.
        */
        /*int length = loadNumber();
        int[] arrA = new int[length];
        int[] arrB = new int[length];
        int[] arrC = new int[length];
        int counterB = 0;
        int counterC = 0;
        for (int i = 0; i < length; i++) {
            int n = loadNumber();
            arrA[i] = n;
            if (n > 35) {
                arrC[counterC] = n;
                counterC++;
            } else {
                arrB[counterB] = n;
                counterB++;
            }
        }
        print(arrA);
        print(arrB);
        print(arrC);*/

        /*
        Napište algoritmus, který pracuje s polem délky N.
        Všechny jeho prvky posune o jeden doleva a první prvek zapomene.
        */
        /*
        int[] arrA = {1, 2, 3, 4, 5, 6};
        int[] arrB = new int[arrA.length];
        for (int i = 1; i < arrA.length; i++) {
            arrB[i - 1] = arrA[i];
        }
        print(arrA);
        print(arrB);
        */

        /*
        Napište algoritmus, který pracuje s polem délky N.
        Všechny jeho prvky posune o jeden doprava a poslední prvek přesune na první pozici
         */
        /*
        int[] arrA = {1, 2, 3, 4, 5, 6};
        int[] arrB = new int[arrA.length];
        arrB[0] = arrA[arrA.length - 1];
        for (int i = 0; i < (arrA.length - 1); i++) {
            arrB[i + 1] = arrA[i];
        }
        print(arrA);
        print(arrB);
        */

        /*
        Napište algoritmus, který vytvoří pole o velikosti N a naplní
        hodnotami 3. mocnin čísel od 1 do N. Hodnotu N zvolí uživatel.
        Nepoužijte pomocnou proměnnou.
	    5 - 1, 8, 27, 64, 125
         */
        /*
        int length = loadNumber();
        int[] arrA = new int[length];
        for (int i = 1; i <= arrA.length; i++) {
            arrA[i - 1] = i * i * i;
        }
        print(arrA);
        */

        /*
        Napište algoritmus, který pracuje s polem délky N.
        Algoritmus provede odebrání k-tého prvku (index)
        a zbylé hodnoty posune doleva.
        Prázdné místo na konci pole vyplní nulou.
         */
        /*
        int k = loadNumber();
        int[] arrA = {1, 2, 3, 4, 5, 6};
        int[] arrB = new int[arrA.length - 1];
        for (int i = 0; i < arrA.length; i++) {
            if (i == k)
                continue;
            if (i > k)
                arrB[i - 1] = arrA[i];
            else
                arrB[i] = arrA[i];
        }
        print(arrA);
        print(arrB);
        */

    }

    private static int loadNumber() {
        System.out.println("Zadejte číslo:");
        int n = scanner.nextInt();
        return n;
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
