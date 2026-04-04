import java.util.*;

class Shape{
    public void Area(){
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape{
    public void Area(int l, int h){
        double a = 0.5 * l * h;
        System.out.println("Area of triangle:" + a);
    }
}

public class Single_level_Inheritance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        Triangle t = new Triangle();
        t.Area(l,h);
    } 
}
