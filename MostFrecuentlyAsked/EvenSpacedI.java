import java.util.Arrays;

class EvenSpacedI{

    public static void main(String [] args){

        int a [] = {100,19,131,140};
        int b [] = {200,1,151,160};
        int c [] = {200,10,151,160};
        int d [] = {100,19,-131,-140};
        int e [] = {80,-56,11,-81};

        System.out.println(isEvenSpaced(a)); // 0 
        System.out.println(isEvenSpaced(b)); // 0
        System.out.println(isEvenSpaced(c)); // 1
        System.out.println(isEvenSpaced(d)); // 1
        System.out.println(isEvenSpaced(e)); // 0
    }

    static int isEvenSpaced (int [] a) {
        int tmp = 0;
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if(a[j] > a[i]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
          }
      }

    int lasgest = a[a.length - 1];
    int smallest = a[0];
    if((lasgest - smallest) % 2 == 0)
        return 1;
    else
        return 0;
    
    }
}