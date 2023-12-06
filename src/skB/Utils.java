package skB;

public class Utils {
    public static void print(int[] arr) {
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
        /*for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }*/
        //sum = Arrays.stream(arr).sum();
        return sum;
    }
}
