public class BinaryQ {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 4, 4};
        int key = 4;
        int first = findFirst(arr, key);
        int last = findLast(arr, key);
        System.out.println("First position: " + first + "Last position: " + last);
    }

    public static int findFirst(int arr[], int key){
        int low = 0, high = arr.length-1;
        int mid = low+(high-low)/2;
        int result = -1;
        while(low<=high){
            if(arr[mid] == key){
                result = mid;
                high = mid-1;
            }else if (arr[mid] > key) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return result;
    }
    public static int findLast(int arr[], int key){
        int low = 0, high = arr.length-1;
        int mid = low+(high-low)/2;
        int result = -1;
        while(low<=high){
            if(arr[mid] == key){
                result = mid;
                low = mid+1;
            }else if (arr[mid] > key) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return result;
    }


}
