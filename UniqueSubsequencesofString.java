import java.util.*;
public class UniqueSubsequencesofString {
    public static void UniSubsequences(String str, int idx, String newstring,HashSet<String> set){
        if(idx == str.length()){
           if(set.contains(newstring)){
            return;
           }else{
            System.out.println(newstring);
            set.add(newstring);
            return;
           }
        }
        char currentchar = str.charAt(idx);
        // for including the character
        UniSubsequences(str, idx+1, newstring + currentchar, set);
        // for excluding the character
        UniSubsequences(str, idx+1, newstring, set);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        System.out.println("Unique Subsequences of the given string are:");
        UniSubsequences(str, 0, "", set);
    }
}
