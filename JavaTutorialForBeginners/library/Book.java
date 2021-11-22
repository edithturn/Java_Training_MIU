package library;

public class Book {

    protected String title;
    protected String ISBN;
    protected boolean status  = false;
    protected int numPages;
    protected int currentPage = 0;

    public void open(){
        status = true;
    }
    public void close(){
        status = false;
    }
    public void checkStatus(){
        if(status == true)
            System.out.println("Turn ON");
        else
            System.out.println("Turn OFF");
    }

    public String getTitle(){
        return title;
    }
    public String getISBN(){
        return ISBN;
    }
    public boolean getStatus(){
        return status;
    }
    public int getNumPages(){
        return numPages;
    }
    public int getCurrentPage(){
        return currentPage;
    }
}
