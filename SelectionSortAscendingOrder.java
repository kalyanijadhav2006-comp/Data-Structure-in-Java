import java.util.Scanner;

public class SelectionSortAscendingOrder {

    public static void Array(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];

        //Input from user
        System.out.print("enter Array Elements:");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        //Selection sort
        for(int i=0; i<A.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<A.length; j++){
                if(A[smallest] > A[j]){
                    smallest = j;
                }
            }
            int temp = A[smallest];
            A[smallest] = A[i];
            A[i] = temp;
        }
        Array(A);
    }
}
