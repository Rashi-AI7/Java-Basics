import java.util.*;

public class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product is: " + product(a, b));
        Factorial.printFact(sc);
        
    }
    public static int product(int a, int b){
        return a*b;
    }
}

class Factorial{
    public static void printFact(Scanner sc){
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







