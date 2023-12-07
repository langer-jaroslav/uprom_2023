package skB;

import java.util.Scanner;

public class Cv11 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        /*
        Naprogramujte metodu, která zobrazí obsah dvourozměrného pole na
        konzoli tak, aby byl výsledek čitelný a přehledný.
         */
        /*int[][] arr = new int[][]{{1, 2, 3}, {40, 5, 6, 10, 15, 20}, {7, 8, 9}};
        print(arr);*/

        /*
        Naprogramujte metodu, která přijímá dvě dvourozměrná pole int stejných
        rozměrů a vrátí dvourozměrné pole, které je výsledkem sčítání těchto dvou
        polí.
         */
        /*int[][] arrA = new int[][]{{1, 2, 3}, {40, 5, 6, 10}, {7, 8, 9}};
        int[][] arrB = new int[][]{{1, 2, 3}, {40, 5, 6, 10}, {7, 8, 9}};
        print(sum(arrA, arrB));*/
        /*
        Vytvořte metodu, která spočítá průměr, minimální a maximální hodnotu.
         */
        /*int[][] arrA = new int[][]{{1, 2, 3}, {40, 5, 6, 10}, {7, 8, 9}};
        int[] result = avgMinMax(arrA);
        System.out.println("avg: " + result[0]);
        System.out.println("min: " + result[1]);
        System.out.println("max: " + result[2]);*/
        /*
        Naprogramujte metodu, která spočítá součet a průměr
        diagonálních prvků (hlavní diagonála) v čtvercovém dvourozměrném poli.
         */
        /*int[][] arrA = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] res = diagSumAvg(arrA);
        System.out.println("sum: " + res[0] + ", avg: " + res[1]);*/
    }
    private static int[] diagSumAvg(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return new int[]{sum, sum / arr.length};
    }
    private static int[] avgMinMax(int[][] arr){
        int sum = 0;
        int min = arr[0][0];
        int max = min;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int currentValue = arr[i][j];
                sum += currentValue;
                if(currentValue<min)
                    min = currentValue;
                if(currentValue > max)
                    max = currentValue;
                count++;
            }
        }
        int avg = sum / count;
        return new int[] {avg, min, max};
    }
    private static int[][] sum(int[][] arrA, int[][] arrB){
        int[][] newArra = new int[arrA.length][];
        for (int i = 0; i < arrA.length; i++) {
            int[] row = new int[arrA[i].length];
            for (int j = 0; j < arrA[i].length; j++) {
                row[j] = arrB[i][j] + arrB[i][j];
            }
            newArra[i] = row;
        }
        return newArra;
    }
    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 10)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
