package skA;

public class Util {
    public static void printArray(int[] arr) {
        System.out.print("array = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i + 1 < arr.length)
                System.out.print(", ");
        }
        System.out.println("]");
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        //sum = Arrays.stream(arr).sum();
        return sum;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            if (item > max)
                max = item;
        }
        //max = Arrays.stream(arr).max().getAsInt();
        return max;
    }

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        return reversed;
    }
}
