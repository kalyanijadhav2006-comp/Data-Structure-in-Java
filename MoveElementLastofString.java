import java.util.Scanner;
public class MoveElementLastofString {
    public static void MoveElement(String str, int index, char element, int count, String newStr){
        if(index == str.length()){
            for(int i=0; i<count; i++){
                newStr += element;
            }
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(index);
        if(currchar == element){
            count++;
            MoveElement(str, index+1, element, count, newStr);
        }else{
            newStr +=currchar;
            MoveElement(str, index+1, element, count, newStr);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();
        System.out.print("Enter the element:");
        char element = sc.next().charAt(0);
        MoveElement(str, 0, element, 0, "");
    }
}
