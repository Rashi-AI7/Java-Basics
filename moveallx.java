//Program to move all "x" to the end of the String

public class moveallx {
    public static void main(String[] args){
        String str = "axbcxxxd";
        System.out.println("Before shifting all x: " + str);
        moveallxs(str, 0, 0, "");
    }
    public static void moveallxs(String str, int idx, int count, String newStr){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newStr+='x';
            }
            System.out.println("After shifting all x: " + newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveallxs(str, idx+1 , count, newStr);
        }else{
            newStr += currChar;
            moveallxs(str, idx+1, count, newStr);
        }
    }
}
