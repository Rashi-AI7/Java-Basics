import java.util.*;

public class Functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The product is: " + product(a, b));
        Factorial.printFact(sc);
        sum.printsum(sc);
        greatint.printint(sc);
        Circumference.printradi(sc);
        
    }
    public static int product(int a, int b){
        return a*b;
    }
}

//Factorial of a number a

class Factorial{
    public static void printFact(Scanner sc){
        System.out.print("Enter the number you want the factorial of: ");
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

//To find the greatest number

class greatint{
    public static void printint(Scanner sc){
        System.err.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        getgreat(a, b);
    }

    public static void getgreat(int a, int b) {
        if(a>b){
            System.out.println(a + " is greater than " + b);
        }
        else{
            System.out.println(b + " is greater than " + a);
        }
    }
}

//Circumference of circle

class Circumference{
    public static void printradi(Scanner sc){
        System.out.print("Enter the radius of circle: ");
        int r = sc.nextInt();
        getcircum(r);
    }

    public static void getcircum(int r){
        double Circum = 2 * 3.14 * r;
        System.out.println("The circumference of circle is " + Circum);
    }
}
