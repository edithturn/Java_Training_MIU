package library;

public class Student {

    private String name;
    private String lastName;
    private String DNI;
    private String phoneNumber; 
    
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDNI(){
        return DNI;
    }
    public String getPhoneNumber(String name){
        return phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
