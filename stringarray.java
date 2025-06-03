import java.util.Scanner;

//To take array of names as input from the user and print them on screen

public class stringarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];

        //input
        for(int i=0; i<size; i++){
            name[i] = sc.next();

        }

        //output
        for(int i=0; i<name.length; i++){
            System.out.println("Name at " + (i+1) + " is " + name[i]);
        }
        sc.close();
    }
}
