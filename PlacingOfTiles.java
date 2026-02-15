import java.util.Scanner;
public class PlacingOfTiles {
    public static int PlaceTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int verticalplacements = PlaceTiles(n-m, m);

        //horizontally
        int horizontalplacements = PlaceTiles(n-1, m);
        return verticalplacements + horizontalplacements ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(PlaceTiles(n,m));
    }
}
