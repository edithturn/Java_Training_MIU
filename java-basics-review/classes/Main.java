
public class Main{

    public static void main(String[] args){
      Dog mydog1 = new Dog("Dog 01", 4);
      Dog mydog2 = new Dog("Dog 02", 10);
      Dog.count = 7;
      Dog.display();
      Dog.display2(); 
    }

    public void display2(){
      System.out.println("I am a dog!");
    }

    public static void display(){
      System.out.println("I am a dog!");
    }
}

// javac Dog.java
// javac Cat.java
// javac Main.java
// java Main