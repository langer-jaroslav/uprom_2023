package skA;

import java.util.Scanner;

public class Cv08 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        /*
        Napište algoritmus, který od uživatele bude načítat N čísel a bude
        je ukládat do pole a. Sudá čísla bude replikovat do pole b.
        */
        /*
        int length = loadNumber();          // načtu jak dlouhá budou pole
        int[] arrA = new int[length];       // deklaruju pole A
        int[] arrB = new int[length];       // deklaruju pole B
        int counterArrB = 0;                // pomocná proměnná pro vkládání do pole B
        for (int i = 0; i < length; i++) {  // cyklus na naplnění pole A
            int n = loadNumber();           // načtení čísla
            arrA[i] = n;                    // uložení čísla do pole A
            if(n % 2 == 0){                 // kontrola zda je číslo sudé
                arrB[counterArrB] = n;      // vložení čísla na pole B
                counterArrB++;              // zvětšení proměnné pro pole B
            }
        }
        printArray(arrA);
        printArray(arrB);
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
        int counterArrB = 0;
        int counterArrC = 0;
        for (int i = 0; i < length; i++) {
            int n = loadNumber();
            arrA[i] = n;
            if (n <= 35) {
                arrB[counterArrB] = n;
                counterArrB++;
            } else {
                arrC[counterArrC] = n;
                counterArrC++;
            }
        }
        printArray(arrA);
        printArray(arrB);
        printArray(arrC);*/

        /*
        Napište algoritmus, který pracuje s polem délky N.
        Všechny jeho prvky posune o jeden doleva a první prvek zapomene.
        */
        /*
        int[] arrA = {5, 9, 16, 39, 47, 23};
        int[] arrB = new int[arrA.length];
        for (int i = 1; i < arrA.length; i++) {
            arrB[i - 1] = arrA[i];
        }
        printArray(arrA);
        printArray(arrB);
        */
        /*
        Napište algoritmus, který pracuje s polem délky N.
        Všechny jeho prvky posune o jeden doprava a poslední prvek
        přesune na první pozici.
        */
        /*
        int[] arrA = {1, 2, 3, 4, 5, 6};
        int[] arrB = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            if (i + 1 == arrA.length) {
                arrB[0] = arrA[i];
                continue;
            }
            arrB[i + 1] = arrA[i];
        }
        printArray(arrA);
        printArray(arrB);
        */

        /*
        Napište algoritmus, který vytvoří pole o velikosti N
        a naplní hodnotami 3. mocnin čísel od 1 do N.
        Hodnotu N zvolí uživatel.
        5    -    1, 8, 27, 64, 125
        */
        /*int length = loadNumber();
        int[] arr = new int[length];
        for (int i = 1; i <= length; i++) {
            arr[i - 1] = i * i * i;
        }
        printArray(arr);
        */

        /*
        Napište algoritmus, který pracuje s polem délky N.
        Algoritmus provede odebrání k-tého prvku (index)
        a zbylé hodnoty posune doleva.
        Prázdné místo na konci pole vyplní nulou.
         */
        int k = loadNumber();
        int[] arrA = {1, 2, 3, 4, 5, 6};
        int[] arrB = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            if (i + 1 == arrA.length) {
                arrB[i] = 0;
                break;
            }
            if (i >= k) {
                arrB[i] = arrA[i + 1];
                continue;
            }
            arrB[i] = arrA[i];
        }
        printArray(arrA);
        printArray(arrB);

    }

    public static int loadNumber() {
        System.out.println("Zadejte číslo");
        int x = scanner.nextInt();
        return x;
    }

    public static void printArray(int[] arr) {
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
