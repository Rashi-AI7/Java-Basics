import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to get reverse counting: ");
        int n = sc.nextInt();
        printBack(n);

        
        sc.close();
    }
    public static void printBack(int n){
            if(n==0){
                return;
            }
            System.out.println(n);
            printBack(n-1);
        }
}
