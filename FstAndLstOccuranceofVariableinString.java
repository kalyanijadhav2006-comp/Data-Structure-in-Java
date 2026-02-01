import java.util.Scanner;
public class FstAndLstOccuranceofVariableinString{
    public static int first = -1;
    public static int last = -1;

    public static void FindOccurance(String str, int index, char element){
        if(index == str.length()){
            System.out.println("First Occurance:" + first);
            System.out.println("Last Occurance:" + last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        FindOccurance(str, index+1, element);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Enter an Element:");
        char element = sc.next().charAt(0);
        FindOccurance(str, 0, element);
    }
}