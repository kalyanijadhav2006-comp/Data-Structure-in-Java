import java.util.*;
public class KeypadCombination {

    public static String[] keypad = {".","abc","def","ghi", "jkl", "mno", "pqrs", "tu" , "vwx", "yz"};

    public static void printcombination(int n, int idx, String combination){
        if(idx == String.valueOf(n).length()){
            System.out.println(combination);
            return;
        }
        char currchar =String.valueOf(n).charAt(idx);
        String mapping = keypad[currchar -'0'];
        for(int i=0; i<mapping.length(); i++){
            printcombination(n, idx+1, combination + mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        int n = sc.nextInt();
        System.out.println(
            "the possible combinations are:"
        );
        printcombination(n, 0, "");
    }
}
