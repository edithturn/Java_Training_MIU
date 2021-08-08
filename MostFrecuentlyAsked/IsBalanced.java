import java.util.Arrays;


public class IsBalanced{

    public static void main(String [] args){

        int a [] = {-2, 3, 2, -3}; // 1
        int b [] =  {-2, 2, 2, 2}; // 0
        int c [] = {-5, 2, -2};    // 0
        int d [] = {-5, 5, -8, 8}; 

        System.out.println(isBalanced(a));
        System.out.println(isBalanced(b));
        System.out.println(isBalanced(c));
        System.out.println(isBalanced(d));

    }
static int isBalanced (int [ ] a){

    int [] b = orderArray(a);

    if(b.length % 2 != 0)
        return 0;

    for (int i = 0; i < b.length; i++){
        if (i < b.length/2){
            if(b[i] + b[b.length -1 - i] != 0){
                return 0;
            }
        }
        else
            break;
    }
    return 1;

}
static int [] orderArray(int [] a){
    int tmp = 0;
    for(int i = 0; i< a.length; i++){
        for(int j = 0; j < a.length; j++){
            if(a[j] > a[i]){
                tmp = a[j];
                a[j] = a[i];
                a[i] = tmp; 
            }
        }
    }
    return a;
}

}