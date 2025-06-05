import java.util.*;

public class bitmanipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Get Bit
        int n = 5; //0101
        int pos = 2;
        int bitMask1 = 1<<pos;

        if((bitMask1 & n) == 0){
            System.out.println("Bit is zero");
        }else
            System.out.println("Bit is non zero");

        //Set Bit
        int m = 6; //0111
        int i = 2;
        int bitMask2 = 1<<i;
        int newNumber1 = bitMask2 | m;
        System.out.println(newNumber1);

        //Clear Bit
        int p = 5;
        int j = 2;
        int bitMask3 = 1<<j;
        int notBitMask = ~(bitMask3);
        int newNumber2 = notBitMask & p;
        System.out.println(newNumber2);

        //Update Bit --> 1 to 0 or 0 to 1
        int q = 4; //0100
        int k = 1;
        int oper = sc.nextInt();
        int bitMask4 = 1<<k;
        
        if(oper == 1){
            //set bit
            int newNumber3 = bitMask4 | q;
            System.out.println(newNumber3); //0110-->6
        }else if(oper == 0){
            //clear bit
            int newNumber3 = (~(bitMask4)) & q ;
            System.out.println(newNumber3); //0101-->5
        }
        sc.close();
    }
}
