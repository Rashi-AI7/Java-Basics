import java.util.Scanner;
// power calculation using recursions, stack height = n

public class calcpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print(x + " raise to the power " + n + " is " + calcpow(x, n));
        sc.close();
    }

    public static int calcpow(int x, int n){
        if(x==0){
            return 0;
        }if(n==0){
            return 1;
        }
        int xpownm1 = calcpow(x, n-1);
        int xpown = x * xpownm1;
        return xpown;
    }
}

