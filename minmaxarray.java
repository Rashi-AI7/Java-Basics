import java.util.Scanner;

public class minmaxarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximun NUmber: " + max);
        System.out.println("Minimum number: " + min);

        sc.close();
    }
}
