import java.util.*;

public class RecursionSample {

    public static void Printnumbers(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Printnumbers(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printnumbers(n);
    }
}
