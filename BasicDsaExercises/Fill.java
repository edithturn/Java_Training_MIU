import java.util.Arrays;

public class Fill{

    public static void main(String [] args){

        int [] a = {1,2,3,5, 9, 12,-2,-1};
        int [] b = {4, 2, -3, 12};
        int [] c = {2, 6, 9, 0, -3};

        System.out.println(Arrays.toString(fill(a, 3, 10)));
        System.out.println(Arrays.toString(fill(b, 1, 5)));
        System.out.println(Arrays.toString(fill(c, 0, 4)));
    }

    static int[] fill(int[] arr, int k, int n){
        
        int j = 0;
        int [] b =  new int[n];
        int flag = 0;

        if(n <= 0 || k <= 0)
            return null;

        while(j <= b.length - 1){
            for(int i = 0; i < k; i++){
                b[j] = arr[i];
                if(j == n - 1){
                    flag = 1;
                    break;
                }
                j += 1;
            }
            if(flag == 1)
                break;
        }
        return b;
    }

}