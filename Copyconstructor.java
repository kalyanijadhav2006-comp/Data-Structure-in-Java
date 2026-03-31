class fruits{
    String color;
    String name;

    public void printproperties(){
        System.out.println("Color:" + this.color);
        System.out.println("Name:" + this.name);
    }

    fruits(fruits f2){
        this.color = f2.color;
        this.name = f2.name;
    }

    fruits(){
        //default constructor
    }
}

public class Copyconstructor {
    public static void main(String args[]){
        fruits f1 = new fruits();
        f1.color = "red";
        f1.name = "apple";

        fruits f2 = new fruits(f1);
        f2.printproperties();
    }
}
