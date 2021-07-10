class Dog{

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("I am a dog, my name is +" + this.name + " " + this.age + "  Years old");
    }
}