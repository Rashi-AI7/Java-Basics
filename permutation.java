import java.util.ArrayList;
import java.util.Scanner;

public class permutation {
    static void getPerm(int arr[], ArrayList<Integer> current, boolean used[], ArrayList<ArrayList<Integer>> result){
        if(current.size() == arr.length){
            result.add(new ArrayList<>(current));
            return; //return to the line just after the recursive call that led us here
        }
        for(int i=0; i<arr.length; i++){
            if(used[i] == true){
                continue;
            }
            used[i] = true;
            current.add(arr[i]);

            getPerm(arr, current, used, result); //Base case hits here

            current.remove(current.size()-1);
            used[i] = false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean[] used = new boolean[arr.length];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        getPerm(arr, new ArrayList<>(), used, result);
        System.out.println(result);
        sc.close();
    }
}
