//Menu Driven program to keep taking input from the user for a student's marks out of hundred as per the user's choice (1/0)
import java.util.*;

public class menudriven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{ 
            System.out.print("Enter the marks of student out of 100: ");
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100){
                System.out.println("This is Good");
            }else if(marks>=80 && marks<=89){
                System.out.println("This is also Good");
            }else if(marks>=0 && marks<=79){
                System.out.println("This is good as well");
            }

            System.out.println("Do you want to continue? ((0) no) or ((1) yes):"  );
            n = sc.nextInt();

        } while(n==1);
        sc.close();
    }
}
