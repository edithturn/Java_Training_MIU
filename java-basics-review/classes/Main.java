
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
      mydog1.add2();
      
    }
}

// javac Main.java
// java Main