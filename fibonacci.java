import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        fibo(n);
        sc.close();
    }

    public static void fibo(int n){
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci series till " + n + " terms: ");
        for(int i=0; i<=n; i++){
            System.out.print( first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
