//(a + 2^0*b), (a+2^0*b+2^1*b)...(a+2^0*b+2^1*b...2^n-1*b)
import java.util.*;

public class integerseq{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();   //Number of queries
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
        for(int j=0; j<n; j++){
            sum += (int)Math.pow(2,j)*b;  //Typecasting as the output will be in double
            System.out.print(sum + " ");
        }
        System.out.println();
    }
    in.close();
    }
}