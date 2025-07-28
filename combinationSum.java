import java.util.ArrayList;

public class combinationSum {
    public static ArrayList<ArrayList<Integer>> combSum(int arr[], int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backTrack(arr, target, 0, new ArrayList<>(), result);
        System.out.println(result);
        return result;
    }

    private static void backTrack(int arr[], int target, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0 || index==arr.length){
            return;
        }
        current.add(arr[index]);
        backTrack(arr, target-arr[index], index, current, result);

        current.remove(current.size()-1);
        backTrack(arr, target, index+1, current, result);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5};
        int target = 8;
        combSum(arr, target);
    }
}
