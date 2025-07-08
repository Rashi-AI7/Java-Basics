public class QuickSort {
    public static void quickSort(int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int pivot = partition(arr, low, high);

        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
            //swapping ith element
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        //if pivot is greater then arr[j]
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void main(String[] args){
        int arr[] = {7, 8, 3, 2, 9, 4};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        //Output
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
