import java.util.Scanner;

public class towerOfHanoi{

        public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n==1){
        System.out.println("Transferred disk " + n + " from " + src +  " to " + dest);
        return;
        }

        towerofHanoi(n-1, src, dest, helper);
        System.out.println("Transferred disk " + n + " from " + src +  " to " + dest);
        towerofHanoi(n-1, helper, src, dest);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = 3;
        towerofHanoi(n, "S", "H", "D");
        sc.close();

    }
    
}