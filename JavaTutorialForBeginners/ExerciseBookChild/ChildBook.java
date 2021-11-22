package ExerciseBookChild;

public class ChildBook extends Book{

    private int recommendedAge = 18;

    public boolean isRecommended( int age){
        if(age >= recommendedAge)
            return true;
        else
            return false;

    }
    
}
