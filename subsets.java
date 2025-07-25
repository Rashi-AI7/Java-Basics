import java.util.ArrayList;
import java.util.Scanner;

public class subsets {
    void generateSubsets(int arr[], int index, ArrayList<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }

        //include
        current.add(arr[index]); // add arr[index] to the current subset
        generateSubsets(arr, index+1, current); // recursive call with next index

        //exclude
        current.remove(current.size() - 1); // remove the last added element
        generateSubsets(arr, index+1, current); // recursive call with next index

    }
    public static void main(String[] args) {
        subsets sub = new subsets();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sub.generateSubsets(arr, 0, new ArrayList<>());
        sc.close();
    }
}
