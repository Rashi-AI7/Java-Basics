public class subsequences{
        public static void subsequence(String str, int idx, String newStr){
            if (idx==str.length()){
                System.out.println(newStr);
                return;
            }
        char currChar = str.charAt(idx);
        
        subsequence(str, idx+1, newStr+currChar);  //char wants to be
        subsequence(str, idx+1, newStr);           // not to be 

        }

        public static void main(String[] args){
        String str = "abc";
        subsequence(str, 0, " ");
        }
    }


