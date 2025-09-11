import java.util.*;

public class gcd {
    public static int GCD(int n1, int n2) {
        while(n1>0 && n2>0){
            if(n1>n2) n1 = n1%n2;
            else n2 = n2%n1;
        }
        if(n1==0) return n2;
        else return n1; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(GCD(n1, n2));
    }
}
