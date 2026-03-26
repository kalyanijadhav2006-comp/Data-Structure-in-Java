import java.util.*;
class InviteNGuest{
    public static int InviteGuest(int n){
        if(n <= 1){
            return 1;
        }
        //single person
        int way1 = InviteGuest(n-1);

        // pairs
        int way2 = (n-1)* InviteGuest(n-2);
        return way1 + way2;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int n = sc.nextInt();
        System.out.println(InviteGuest(n));
    }
}