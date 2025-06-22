import java.util.Scanner;

//To reverse a string using recursions

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        revstr(str, str.length()-1);
        sc.close();

    }

    public static void revstr(String str, int idx){
        if(idx==0){
        System.out.println(str.charAt(idx));
        return;
        }

        System.out.print(str.charAt(idx));
        revstr(str, idx-1);
    }
}
