public class Polymorphism {
    public static void main(String args[]){
        Employee Emp = new Employee();
        Emp.name = "Kalyani";
        Emp.age = 20;
        Emp.EmpInfo(Emp.name,Emp.age);
    }
}

class Employee{
    String name;
    int age;

    public void Empnfo(String name){
        System.out.println("Name:" + name);
    }

    public void EmpInfo(int age){
        System.out.println("age:" + age);
    }

    public void EmpInfo(String name, int age){
        System.out.println("Name:" + name + " " + "Age:" + age);
    }
}