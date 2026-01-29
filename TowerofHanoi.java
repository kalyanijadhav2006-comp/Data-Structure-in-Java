import java.util.Scanner;
public class TowerofHanoi {
    public static void towerofhanoi(int n, String s, String h, String d){
        if(n == 1){
            System.out.println("transfer disk"+ " " + n + " " + "from" + " " + s + " " + "to" + " " + d);
            return;
        }
        towerofhanoi(n-1, s, d, h);
        System.out.println("transfer disk"+ " " + n + " " + "from" + " " + s + " " + "to" + " " + d);
        towerofhanoi(n-1, h, s, d);
    }
    public static void main(String rags[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Disks:");
        int n = sc.nextInt();
        towerofhanoi(n, "S", "H", "D");
    }
}
