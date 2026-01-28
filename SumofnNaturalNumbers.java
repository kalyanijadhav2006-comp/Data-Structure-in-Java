import java.util.Scanner;

public class SumofnNaturalNumbers {
    public static void sum(int n, int i, int sum){
        if(i == n+1){
            System.out.println(sum);
            return;
        }
        sum += i;
        sum(n, i+1, sum);
        System.out.println(i);
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i =1;
        int sum = 0;
        sum(n, i, sum);
    }
}

