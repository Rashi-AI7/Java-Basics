import java.util.ArrayList;
import java.util.Arrays;

public class combinationSum2 {
    public ArrayList<ArrayList<Integer>> printSum(int[] arr, int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backTrack(arr, target, 0, new ArrayList<>(), result);
        
        return result;

    }

    private void backTrack(int arr[], int target, int start, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result ){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return; 
        }

        for(int i=start; i<arr.length; i++){
            if(i>start && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            current.add(arr[i]);
            backTrack(arr, target-arr[i], i+1, current, result);
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        combinationSum2 cs = new combinationSum2();
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        ArrayList<ArrayList<Integer>> result = cs.printSum(arr, target);
        System.out.println(result);
    }
}
