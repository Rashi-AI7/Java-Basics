import java.util.Scanner;
//Backward counting from n

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to get reverse counting: ");
        int n = sc.nextInt();
        printBack(n);
        recursion2.printnum(sc);
        recursion3.printFact(sc);
        
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
//  Sum of first n natural numbers

class recursion2 {
    public static void printnum(Scanner sc){
        System.out.print("Enter n: ");
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

//Factorial Using recursion

class recursion3{
    public static void printFact(Scanner sc) {
        System.out.print("Enter the number to get it's factorial: ");
        int p = sc.nextInt();
        System.out.println("The Factorial of " + p + " is " + calcFact(p));
    }

    public static int calcFact(int p){
        if(p==0||p==1){
        return 1;
        }else{
        return p*calcFact(p-1);
        }
    }
}
