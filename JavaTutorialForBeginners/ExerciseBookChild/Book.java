package ExerciseBookChild;

public class Book {

    private String title;
    private String ISBN;
    private Boolean open = false;
    private int numPages;
    private int currentPage = 0;

    public static void open(){
        System.out.println("Book Open");
    }

    public static void close(){
        System.out.println("Book Close");
        
    }
    
}
