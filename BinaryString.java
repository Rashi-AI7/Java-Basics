public class BinaryString {
    public static void printString(int n, int lastPlace, String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        printString(n-1, 0, s+"0");
        if(lastPlace==0){
            printString(n-1, 1, s+"1");
            // printString(n-1, 1, s+="1");
        }
        
    }
    public static void main(String[] args) {
        printString(3, 0, "");
    }
}
