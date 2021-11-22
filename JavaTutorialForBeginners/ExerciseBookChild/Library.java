package ExerciseBookChild;

public class Library {

    public static void main(String[] args){

        ChildBook l = new ChildBook();

        if(l.isRecommended(18))
            System.out.println("Is recommended");
        else
            System.out.println("NO recommended");
    }
    
}
