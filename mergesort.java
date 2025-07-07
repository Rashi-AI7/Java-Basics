public class mergesort{

    // Divide the array into two halves

    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return; // Base case: if the array has one or no element
        }
        
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);      //Divide left half
        divide(arr, mid+1, ei);    //Divide right half
        merged(arr, si, mid, ei);  //Merge both halves
    }

    //Merge two sorted halves into one

    public static void merged(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];

        int idx1 = si;         //Pointer for left half
        int idx2 = mid+1;      //Pointer for right half
        int x = 0;             //Pointer for merged array


        //Merge the two sorted halves
        
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }


        //Copy remaining elements from left half (if any)
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        //Copy remaining elements from right half (if any)
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        //copy merged array back to the original array
        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args){
        int arr[] = {6, 3, 9, 2, 4, 1};
        int n = arr.length;
        divide(arr, 0, n-1);


        //print the sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


