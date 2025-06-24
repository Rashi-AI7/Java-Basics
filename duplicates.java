//To remove duplicate elements from string

public class duplicates {
    static boolean map[] = new boolean[26]; 
    public static void main(String[] args){
        String str = "abbccda";
        removedup(0, str, " ");
    }

    public static void removedup(int idx, String str, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true)
        removedup(idx+1, str, newStr);
        else{
            newStr += currChar;
            map[currChar-'a'] = true;
            removedup(idx+1, str, newStr);
        }
    }
}
