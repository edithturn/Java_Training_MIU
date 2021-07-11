
public class Dog{

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        add2();
    }

    public void speak(){
        System.out.println("I am a dog, my name is " + this.name + " " + this.age + "  Years old");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age  = age;
    }

    private int add2(){
        return this.age;
    }
}