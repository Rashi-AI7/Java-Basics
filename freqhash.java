//leetcode - 3005
import java.util.HashMap;
import java.util.Scanner;
class Solution {
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq  = new HashMap<>();
        //created map
        for(int el: nums){
            freq.put(el, freq.getOrDefault(el, 0) + 1);
        }
        //count max freq
        int maxfreq = 0;
        for(int fq: freq.values()){
            maxfreq = Math.max(maxfreq, fq);
        }
        //counting numbers with max freq
        int nwmf = 0;
        for(int frq: freq.values()){
            if(maxfreq == frq){
                nwmf++;
            }
        }
        return nwmf*maxfreq; //sum of frequencies of elements that occur the maximum number of times

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = maxFrequencyElements(arr);
        System.out.println(result);
    }
}
