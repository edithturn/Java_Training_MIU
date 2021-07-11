
public class Main{

    public static void main(String[] args){
      Dog mydog1 = new Dog("Dog 01", 4);
      mydog1.speak();

      Dog mydog2 = new Dog("Dog 02", 7);
      mydog2.speak();

      Dog mydog3 = new Dog("Dog 03", 9);
      mydog3.speak();

      mydog1.speak();

      mydog1.setAge(50);
      mydog1.speak();

      
      // Calling Cat
      Cat maxi = new Cat("Tony", 18, 100);
      maxi.speak();

      Cat cat1 = new Cat("Rosi", 18, 100);
      Cat cat2 = new Cat("Tony", 20, 49);
      Cat cat3 = new Cat("Maxi", 20, 56);

      cat1.speak();
      cat2.speak();
      cat3.speak();



      
    }
}

// javac Main.java
// java Main