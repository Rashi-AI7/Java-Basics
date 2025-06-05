import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int arr[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];  //for creating space for the elements
                j--;
            }
            arr[j+1] = current;
        }
        //output
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
