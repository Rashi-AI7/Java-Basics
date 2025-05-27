//To print all even numbers till n

import java.util.*;

public class evennum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any ending number until when you want even numbers: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            if(i%2 ==0)
            System.out.println(i);
        }
        sc.close();
    }
}