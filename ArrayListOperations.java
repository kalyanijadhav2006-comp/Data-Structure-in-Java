import java.util.ArrayList;
import java.util.Collections;
public class ArrayListOperations {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add
        list.add(5);
        list.add(7);
        list.add(1);
        System.out.println(list);

        //get
        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1, 6);
        System.out.println(list);

        //set
        list.set(1, 6);
        System.out.println(list);

        //delete
        list.remove(1);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}