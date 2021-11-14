import java.util.Arrays;

class Fill{

    public static void main(String [] args){
       
        int [] a = {1,2,3,5, 9, 12,-2,-1};
        int [] b = {4, 2, -3, 12};
        int [] c = {2, 6, 9, 0, -3};

        System.out.println(Arrays.toString(fill(a, 3, 10))); // {1,2,3,1,2,3,1,2,3,1}.
        System.out.println(Arrays.toString(fill(b, 1, 5))); // {1,2,3,1,2,3,1,2,3,1}.
        System.out.println(Arrays.toString(fill(c, 0, 4))); // {1,2,3,1,2,3,1,2,3,1}.
        


    }

    static int[ ] fill(int[ ] arr, int k, int n){

        int [] filled = new int[n];
        int j = 0;

        if(k <= 0 || n <= 0)
            return null;
        
        for(int i = 0; i < filled.length; i++){
            if(j < k){
                filled[i] = arr[j];
                j++;
            }
            else{
                j = 0;
                filled[i] = arr[j];
                j++;
            }
                
        }
        return filled;
    }
         
}
