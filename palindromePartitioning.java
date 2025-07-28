import java.util.ArrayList;

public class palindromePartitioning {
    static boolean isPalindrome(String str){
        int left = 0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    static void getAllParts(String str, ArrayList<ArrayList<String>> result, ArrayList<String> Partitions){
        if(str.length() == 0){
            result.add(new ArrayList<>(Partitions));
            return;
        }
        for(int i=0; i<str.length(); i++){
            String part = str.substring(0, i+1);
            if(isPalindrome(part)){
                Partitions.add(part);
                getAllParts(str.substring(i+1), result, Partitions);
            Partitions.remove(Partitions.size()-1);
            }
            
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        String str = "aab";
        getAllParts(str, result, new ArrayList<>());
        System.out.println(result);
    }
}
