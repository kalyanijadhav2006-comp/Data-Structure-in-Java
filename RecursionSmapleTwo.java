import java.util.Scanner;

public class RecursionSmapleTwo {
    public static void printnum(int n, int k){
        if(n == k+1){
            return;
        }
    System.out.println(n);
        printnum(n+1, k);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 1;
        printnum(n,k);
    }
}
