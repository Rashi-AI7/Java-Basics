import java.util.HashSet;

public class UnionHashSet {
    public static void Union(int arr1[], int arr2[]){
        HashSet <Integer> set = new HashSet<>();
        int n = arr1.length;
        int m = arr2.length;
        for(int i=0; i<n; i++){
            set.add(arr1[i]);
        }for(int j=0; j<m; j++){
            set.add(arr2[j]);
        }
        for(int val: set){
            System.out.println(val);
        }
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        Union(arr1, arr2);
    }
}
