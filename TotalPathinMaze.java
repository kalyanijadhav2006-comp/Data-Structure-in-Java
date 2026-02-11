import java.util.Scanner;
public class TotalPathinMaze{
    public static int pathcount(int i, int j, int n, int m){
        if(i == n ||j == m){
            return 0;
        }
        if(i ==n-1 && j == m-1){
            return 1;
        }
        //move downwards
        int downpaths = pathcount(i+1, j, n, m);
        //move right
        int rightpaths = pathcount(i, j+1, n, m);
        return downpaths + rightpaths;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        System.out.println("enter the value of m:");
        int m = sc.nextInt();
        int totalpaths = pathcount(0, 0, n, m);
        System.out.println("total no of paths:" + totalpaths);
    }
}