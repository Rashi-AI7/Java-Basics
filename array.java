import java.util.Scanner;

//To take an array as input and printing its elements
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}



