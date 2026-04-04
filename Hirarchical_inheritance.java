class Animal{
    String name;
    String sound;
}

class Dog extends Animal{
    public void dogInfo(String name, String sound){
        System.out.println("Animal is" + " " + name + " " + "and it" + " " + sound);
    }
}

class Cat extends Animal{
    public void catInfo(String name, String sound){
        System.out.println("Animal is" + " " + name + " " + "and it" + " " + sound);
    }
}

public class Hirarchical_inheritance {
    public static void main(String args[]){

        // for dog
        Dog d = new Dog();
        d.name = "Dog";
        d.sound = "Barks";
        d.dogInfo(d.name, d.sound);

        // for cat
        Cat c = new Cat();
        c.name = "Cat";
        c.sound = "Meows";
        c.catInfo(c.name, c.sound);
    }
}

