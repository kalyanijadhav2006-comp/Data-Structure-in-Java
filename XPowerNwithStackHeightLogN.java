import java.util.Scanner;

public class XPowerNwithStackHeightLogN {

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        //if n is even
        if(n % 2 == 0){
            return power(x, n/2) *  power(x, n/2);
        }else{
            return x *  power(x, n/2) *  power(x, n/2);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int result = power(x, n);
        System.out.println("The power of number is:" + result);
    }
}
