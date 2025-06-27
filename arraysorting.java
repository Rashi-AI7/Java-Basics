import java.util.Scanner;

public class arraysorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));
        sc.close();
    }

    public static boolean isSorted(int[] arr, int idx) {
        if (idx >= arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }
}
