class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something.");
    }

    public void printproperties(String color, String type){
    System.out.println("Color: " + color);
    System.out.println("Type: " + type);
}
}


public class ClassesandObjects {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        pen1.printproperties(pen1.color, pen1.type);
    }
}