import java.util.*;

public class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product is: " + product(a, b));
        Factorial.printFact(sc);
        sum.printsum(sc);
        
    }
    public static int product(int a, int b){
        return a*b;
    }
}

//Factorial of a number a

class Factorial{
    public static void printFact(Scanner sc){
        System.out.print("Enter the number of which you want factorial: ");
        int a = sc.nextInt();
        System.out.println("The factorial of " + a + " " + "is" + " " + calcfact(a));
}
    public static int calcfact(int a){
        if(a<0){
            System.out.println("Invalid number");
                return 0;
        }
        int factorial = 1;
        for(int i=a; i>=1; i--){
            factorial*=i;
        }
        return factorial;
    }
}

//Sum of all odd numbers from 1 to n

class sum{
    public static void printsum(Scanner sc) {
        System.out.print("Enter the number till which you want sum: ");
        int n = sc.nextInt();
        oddsum(n);
    }

    public static void oddsum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}




