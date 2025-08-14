import java.util.HashSet;

public class IntSet {
    public static void Intersection(int[] arr1, int[] arr2){
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> intelement = new HashSet<>();
        int n = arr1.length;
        int m = arr2.length;
        int count = 0;
        for(int i=0; i<n; i++){
            set.add(arr1[i]);
        }for(int j=0; j<m; j++){
            if(set.contains(arr2[j])){
                count ++;
                intelement.add(arr2[j]);
                set.remove(arr2[j]);
                
            }
        }
        System.out.println(count);
        System.out.println("Elements in intersection: " + intelement);

    }
    public static void main(String[] args) {
        int[] arr1 = {7, 5, 9, 10, 3, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        Intersection(arr1, arr2);
    }
}
