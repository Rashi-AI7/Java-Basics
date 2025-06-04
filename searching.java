import java.util.Scanner;

public class searching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] == x){
                    System.out.println(x + " found at location " + "(" + i + "," + j + ")");
                }
            }
        }
        sc.close();
}
}