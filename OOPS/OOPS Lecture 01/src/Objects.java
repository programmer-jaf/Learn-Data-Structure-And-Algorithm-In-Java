public class Objects {
  public static class Animal {
    int legs;
    int eyes;

    //   behaviors
    void makeSound() {
      System.out.println("make sound...");
    }
  }

  public static void main(String[] args) {
    System.out.println("Learn about Objects in Java");

    // Create an Object of the class
    // Make sure add new keyword else Object can't be created
    Animal animal = new Animal();

    //  Access Properties using [.] Operator
    animal.legs = 4;
    animal.eyes = 2;

    System.out.println(animal.legs);
    System.out.println(animal.eyes);
    //  access the behaviors
    animal.makeSound();
  }
}
