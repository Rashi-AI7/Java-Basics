import java.util.Scanner;
import java.util.ArrayList;

public class RatinMaze {
    static void solve(int[][] maze, int n, int x, int y, String path, ArrayList<String> result, boolean[][] visited){
        if(x==n-1 && y==n-1){
            result.add(path);
            return;
        }

        visited[x][y] = true;
        //Down
        if(x+1<n && maze[x+1][y]==1 && !visited[x+1][y]){
            solve(maze, n, x+1, y, "D", result, visited);
        }
        //Left
        if(y-1>=0 && maze[x][y-1]==1 && !visited[x][y-1]){
            solve(maze, n, x, y-1, "L", result, visited);
        }
        //Right
        if(y+1<n && maze[x][y+1]==1 && !visited[x][y+1]){
            solve(maze, n, x, y+1, "R", result, visited);
        }
        //Up
        if(x-1>=0 && maze[x-1][y]==1 && !visited[x-1][y]){
            solve(maze, n, x-1, y, "U", result, visited);
        }
        visited[x][y] = false;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maze size: ");
        int n = sc.nextInt();

        int[][] maze = new int[n][n];

        //input
        //rows
        for(int i=0; i<n; i++){
            //columns
            for(int j=0; j<n; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        ArrayList<String> result = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if(maze[0][0]==1){
            solve(maze, n, 0, 0, "", result, visited);
        }
        
        System.out.println(result);
        sc.close();
    }
}
