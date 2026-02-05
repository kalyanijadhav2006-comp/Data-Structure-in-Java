import java.util.Scanner;
public class RemoveDuplicateFromString {
    public static boolean[] map = new boolean[26];

    public static void RemoveDuplicate(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currentchar = str.charAt(idx);
        if(map[currentchar - 'a']){
            RemoveDuplicate(str, idx+1, newstring);
        }else{
            newstring += currentchar;
            map[currentchar - 'a'] = true;
            RemoveDuplicate(str, idx+1, newstring);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("String after removing duplicates:");
        RemoveDuplicate(str, 0, ""); 
    }
}
