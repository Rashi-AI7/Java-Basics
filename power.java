import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        pow(n, x);
        sc.close();
    }

    public static void pow(int n, int x){
        int result = 1;
        for(int i=0; i<n; i++){
            result = result * x; //to calculate power of a number
        }
        System.out.println("x to the power n is: " + result);
        
    }
}
