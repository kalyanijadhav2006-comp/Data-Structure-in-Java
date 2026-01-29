import java.util.*;

public class XPowerN {
    public static int calcpow(int x, int n){
        if(n ==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xpownm1 = calcpow(x, n-1);
        int xpown = x * xpownm1;
        return xpown;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int ans = calcpow(x, n);
        System.out.println("The value of Power:" +ans);
    }
}
