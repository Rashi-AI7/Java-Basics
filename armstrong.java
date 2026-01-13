import java.util.Scanner;

public class armstrong {
    public static boolean isArmstrong(int n) {
        int count = 0;
        int dup = n;
        int ori = n;
        while(dup>0){
            count++;
            dup/=10;
        }
        int sum = 0;
        int dup2 = ori;
        while(dup2>0){
            int digit = dup2%10;
            int powe = 1;
            for(int i=1; i<=count; i++){
                powe*=digit; //To multiply digits their count times
            }
            sum+=powe;
            dup2/=10;
        }
        return sum == ori;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}
