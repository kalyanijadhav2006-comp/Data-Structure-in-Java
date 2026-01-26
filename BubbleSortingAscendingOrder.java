import java.util.*;

public class BubbleSortingAscendingOrder{
    public static void Array(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int A[] = new int[n];

        System.out.print("Enter Array Elements:");
        // Taking inputs from user
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        // Time Complexity is O(n^2)
        // Bubble sort
        for(int i=0; i<A.length-1; i++){
            for(int j=0; j<A.length-1-i; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        Array(A);
    }
} 