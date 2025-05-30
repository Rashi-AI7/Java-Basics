import java.util.*;
public class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        invertedPatt.pattern(sc);
        sc.close();
    }
}

class invertedPatt{
    public static void pattern(Scanner sc){
        System.out.print("2. Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            } 
            System.out.println();
        }
        
    }
}
