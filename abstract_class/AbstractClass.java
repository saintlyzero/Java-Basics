/**
 * AbstractClass
 */
 class AbstractClass {

  public static void main(String[] args) {
        
    Dog tuffy = new Dog();
    Lion simba = new Lion();

    tuffy.classInfo("Dog");
    tuffy.sound();
    simba.classInfo("Lion");
    simba.sound();
        
  }
}

abstract class Animal {
  int legs = 4;
  abstract void sound();
  
  void classInfo(String type){
    System.out.println("I belong to "+type+" family");
  }
}

 class Dog extends Animal {

  void sound(){
    System.out.println("Woof Woof...");
    System.out.println("I have "+legs+" legs\n");
  }  
}

 class Lion extends Animal {

  void sound(){
    System.out.println("Roar..");
    System.out.println("I have "+legs+" legs");
    
  }  
}