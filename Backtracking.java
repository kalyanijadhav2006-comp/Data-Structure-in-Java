import java.util.*;
public class Backtracking {
    public static void printpermutation(String str, String perm,int index){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printpermutation(newstr, perm+currchar, index+1); 
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = sc.nextLine();
        System.out.println("All the permutations of the String are:");
        printpermutation(str, "", 0);
    }
}
