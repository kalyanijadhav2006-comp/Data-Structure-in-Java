import java.util.Scanner;

public class FactorialofNumbers{
    public static int Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fact_nm1 = Factorial(n -1);
        int fact_n = n* fact_nm1;
        return fact_n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Fact = Factorial(n);
        System.out.println("Factorial of number:" + " " + Fact);
    }
}