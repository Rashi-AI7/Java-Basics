import java.util.Scanner;

//Checks if array is sorted into ascending order or not
public class sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int arr[] = new int[size];
        
        //input
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;
        
        //output
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array IS sorted in ascending order.");
        }else
            System.out.println("The array IS NOT sorted in ascending order.");

        sc.close();
    }
}
