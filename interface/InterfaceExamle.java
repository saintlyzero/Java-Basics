
interface Animal {
    void sound();
}


class Dog implements Animal {

    public void sound(){
        System.out.println("Woof Woof...");
    }
}

class Lion implements Animal {

    public void sound(){
        System.out.println("Roar...");
    }
}

/**
 * InterfaceExamle
 */
class InterfaceExamle {
    
 public static void main(String[] args) {

    Dog tuffy = new Dog();
    Lion simba = new Lion();

    tuffy.sound();
    simba.sound();
     
 }   
}