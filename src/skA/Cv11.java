package skA;


import java.util.Scanner;

public class Cv11 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        /*int[] pole = new int[10];

        int rows = 3;
        int cols = 4;

        int[][] pole2 = new int[rows][cols];
        pole2[1][1] = 50;
        int cislo = pole2[1][1];

        rows = pole2.length;
        cols = pole2[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
            }
        }*/
        /*
        Naprogramujte metodu, která zobrazí obsah dvourozměrného pole na
        konzoli tak, aby byl výsledek čitelný a přehledný.
         */
        /*int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6, 10}, {7, 8, 9}};
        print(arr);*/
        /*
        Naprogramujte metodu, která přijímá dvě dvourozměrná pole int stejných
        rozměrů a vrátí dvourozměrné pole, které je výsledkem sčítání těchto dvou polí.
         */
        /*int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6, 10}, {7, 8, 9}};
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6, 15}, {7, 8, 9}};
        print(sum(arr, arr2));*/
        /*
        Vytvořte metodu, která spočítá průměr hodnot v sloupci dvourozměrného pole.
         */
        /*int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("avg=" + avg(arr, 2));*/
        /*
        Naprogramujte metodu, která najde minimální a maximální
        hodnotu v dvourozměrném poli a vrátí je jako výstup.
         */
        /*int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] minMaxResult = minMax(arr);
        System.out.println("min: " + minMaxResult[0] + ", max: " + minMaxResult[1]);*/
        /*
        Naprogramujte metodu, která spočítá součet a průměr
        diagonálních prvků (hlavní diagonála) v čtvercovém dvourozměrném poli.
         */
        /*int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] res = diagSumAvg(arr);
        System.out.println("sum: " + res[0] + ", avg: " + res[1]);*/
    }

    private static int[] diagSumAvg(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return new int[]{sum, sum / arr.length};
    }

    private static int[] minMax(int[][] arr) {
        int[] result = new int[]{arr[0][0], arr[0][0]};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < result[0])
                    result[0] = arr[i][j];
                if (arr[i][j] > result[1])
                    result[1] = arr[i][j];
            }
        }
        return result;
    }

    private static double avg(int[][] arr, int col) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i][col];
        }
        avg /= (double) arr.length;
        return avg;
    }

    private static int[][] sum(int[][] arr1, int[][] arr2) {
        int[][] newArra = new int[arr1.length][];
        for (int i = 0; i < arr1.length; i++) {
            int[] row = new int[arr1[i].length];
            for (int j = 0; j < arr1[i].length; j++) {
                row[j] = arr1[i][j] + arr2[i][j];
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
