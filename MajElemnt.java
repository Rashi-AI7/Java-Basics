import java.util.HashMap;

public class MajElemnt{
    public static void majorityElement(int arr[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int val: map.keySet()){
            if(map.get(val)> n/3){
                System.out.println(val);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int n = arr.length;
        majorityElement(arr, n);
    }
}