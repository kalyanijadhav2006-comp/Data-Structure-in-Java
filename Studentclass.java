class Student{
    String name;
    int rollno;
    int age;

    public void printInfo(){
        System.out.println("Name:" + this.name);
        System.out.println("Roll No:" + this.rollno);
        System.out.println("Age:" + this.age);
    }
}

public class Studentclass {
    public static void main(String args[]){
        Student s1 = new Student();
        s1. name = "Kalyani";
        s1.rollno = 8;
        s1.age = 20;
        s1.printInfo();
    }
}
