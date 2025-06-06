import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to get reverse counting: ");
        int n = sc.nextInt();
        printBack(n);
        recursion2.printnum(sc);
        
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

class recursion2 {
    public static void printnum(Scanner sc){
        System.out.println("Enter any natural number to get it's sum: ");
        int m = sc.nextInt();
        int sum = 0;
        printsum(m, sum);
    }
    public static void printsum(int m, int sum){
        if(m==0){
            System.out.println(sum);
            return;
        }
        
        sum+=m;
        printsum(m-1, sum);
    }
}