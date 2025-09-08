import java.util.*;
public class getnozeroint {
    public static int[] getNoZeroIntegers(int n) {
        for(int a=1; a<n; a++){
            int b = n-a;
            if(isValid(a) && isValid(b)){
                return new int[] {a,b};
            }
            }
            return new int[0];
    }
    public static boolean isValid(int num){
        while(num>0){
            if(num%10==0) return false;
            num/=10; //if number is 1000 or 102 like
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));
        sc.close();
    }
}
