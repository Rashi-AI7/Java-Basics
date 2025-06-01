import java.util.*;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0,  zeros = 0;
        System.out.println("Press 1 to continue and 0 to stop: ");
        int input = sc.nextInt();

        while(input == 1){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if(n>0){
                positive++;
                
            }else if(n<0){
                negative++;
                
            }else
                zeros++;
        System.out.println("Press 1 to continue and 0 to stop: ");
        input = sc.nextInt();    
        }
        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeros: " + zeros);
        sc.close();
    }
}
