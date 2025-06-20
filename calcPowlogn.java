import java.util.*;

// power calculation using recursions, stack height = logn

public class calcPowlogn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int ans = calcPow(x, n);
        System.out.print(x + " raise to the power " + n + " is " + ans );
        sc.close();
    }
    public static int calcPow(int x, int n){
        if(n==0){
            return 1;
        }if(x==0){
            return 0;
        }

        if(n%2==0){
            return calcPow(x, n/2) * calcPow(x, n/2);
        }
        else{
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }
}