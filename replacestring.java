import java.util.Scanner;

//to replace 'e' with 'i'

public class replacestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e'){ //if the char is e, add i to the result
                result += 'i';
            }else{
                result += str.charAt(i); //otherwise keep the original characters
            }
        }
        System.out.println(result);
        sc.close();
    }
}
