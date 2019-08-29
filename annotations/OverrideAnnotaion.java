/**
 * OverrideAnnotaion
 */

class Dog {

    String name;
    String color;

    Dog(String name, String color){
        this.name = name;
        this.color = color;
    }
    @Override
    public String toString() {
        String info = "My name is "+name+" :)\nI'm a "+color+" colored dog";
        return info;
    }
}

public class OverrideAnnotaion {

    public static void main(String[] args) {

        Dog tommy = new Dog("Tommy", "Brown");
        System.out.println(tommy.toString());
    }
}