import java.util.Arrays;

public class goodSpread{

    public static void main(String [] args){
        
        int [] a =  {2, 1, 2, 5, 2, 1, 5, 9};
        int [] b =  {3, 1, 3 ,1, 3, 5, 5, 3};
        int [] c =  {3, 3, 3 ,3, 3, 5, 5, 3};

        System.out.println(goodSpread(a));
        System.out.println(goodSpread(b));
        System.out.println(goodSpread(c));


    }

    // Count the repetitions of an element and comparng with the maximun allowed (3)

    static int goodSpread (int[ ] a) {

        int [] b = orderArray(a);
        int count = 1;

        for(int i = 0; i < b.length - 1; i++){ 
            if (b[i + 1] == b[i]){
                count += 1;
                if (count > 3){
                    return 0;
                }
            }
            else{
                count = 1;
            }
        }
        return 1;
    }

    // Ordering the array ascending

    static int[] orderArray(int [] a){
        
        int tmp = 0;

        for (int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){

                if(a[i] > a[j]){
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        return a;

    }

}