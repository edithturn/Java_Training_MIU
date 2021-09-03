import java.util.Arrays;


public class IsBalanced{

    public static void main(String [] args){

        int a [] = {-2, 3, 2, -3}; // 1
        int b [] =  {-2, 2, 2, 2}; // 0
        int c [] = {-5, 2, -2};    // 0
        int d [] = {-5, 5, -8, 8};  // 1

        System.out.println(isBalanced(a));
        System.out.println(isBalanced(b));
        System.out.println(isBalanced(c));
        System.out.println(isBalanced(d));

    }
static int isBalanced (int [ ] a){

    int expectedNumber = 0;
    int flag = 0;

    for (int i = 0; i < a.length; i++){
        expectedNumber = -a[i];
        for(int j = 0; j < a.length; j++){
            if (a[j] == expectedNumber){
                flag = 1;
                break;
            }            
        }
        if(flag == 0)
            return 0;
        }
    return flag;
    }
}