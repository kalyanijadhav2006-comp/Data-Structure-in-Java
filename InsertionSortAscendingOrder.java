import java.util.Scanner;

public class InsertionSortAscendingOrder {

    public static void Array(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];

        System.out.print("Enter Array Elements:");
        // input from the user
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }

        //Insertion Sort
        for(int i=1; i<A.length; i++){
            int current = A[i];
            int j = i-1;
            while(j >= 0 && current < A[j]){
                A[j+1] = A[j];
                j--;
            }
            //placing number
            A[j+1] = current;
        }
        Array(A);
    }
}
