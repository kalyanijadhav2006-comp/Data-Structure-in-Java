class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
    }

    student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
    
public class ParametrizedConstructor {
    public static void main(String args[]){
        student s1 = new student("Kalyani", 20);
        s1.printinfo();
    }
}
