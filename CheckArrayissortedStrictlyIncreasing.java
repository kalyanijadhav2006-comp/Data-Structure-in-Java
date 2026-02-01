import java.util.Scanner;
public class CheckArrayissortedStrictlyIncreasing {
    public static boolean SortedArray(int n, int index, int arr[]){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] >= arr[index+1]){
            return false;
        }
        return SortedArray(n, index+1, arr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the Elements of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean result = SortedArray(n, 0, arr);
        System.out.println(result);
    }
}
