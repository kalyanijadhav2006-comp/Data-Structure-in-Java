import java.util.Scanner;

public class SubsequencesofString {
    public static void Subsequences(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currentchar = str.charAt(idx);
        //call 1 for  including the character
        Subsequences(str, idx+1, newstring + currentchar);
        //call 2 for excluding the character
        Subsequences(str, idx+1, newstring);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Subsequences of the given string are:");
        Subsequences(str, 0, "");
    }
}
