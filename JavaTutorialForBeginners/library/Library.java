package library;

public class Library {

    public static void main(String[] args){

        Book objBook = new Book();
        Student objStudent = new Student();

        objBook.checkStatus();
        objBook.open();
        objBook.checkStatus();
        objBook.close();
        objBook.checkStatus();

        objStudent.setName("Rosita");
        System.out.println(objStudent.getName());
    }
    
}
