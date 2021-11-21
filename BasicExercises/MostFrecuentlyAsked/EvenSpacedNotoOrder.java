import java.util.Arrays;

class EvenSpaced{

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
    static int isEvenSpaced(int[] a){

        int largest = a[0];
        int smallest = a[1];
    

        for(int i = 2; i < a.length; i++){
            if(a[i] > largest)
                largest = a[i];
            if(a[i] < smallest)
                smallest = a[i];
        }
    
    return (largest - smallest) % 2 == 0 ? 1 : 0;
    }
}