package Arrays;

public class Group {
    private Student[] students = null;

    public Group(){
        students = new Student[5];

        for(int i = 0; i < 5; i++){
            students[i] = new Student();
        }
       }
}
