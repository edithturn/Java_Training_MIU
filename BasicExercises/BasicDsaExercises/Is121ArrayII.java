public class Is121Array{

    public static void main(String [] args){

        int [] a = {1,2,1};                             // returns 1
        int [] b = {1,1,2,2,2,1,1};                     // returns 1
        int [] c = {1,1,2,2,2,1,1,1};                   // returns 0
        int [] d = {1, 1, 2, 1, 2, 1, 1};               // returns 0
        int [] e = {1, 1, 1, 2, 2, 2, 1, 1, 1, 3};      // returns 0
        int [] f = {1,1,1,1,1,1};                       // returns 0
        int [] g = {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1};   // returns 0
        int [] h = {1, 1, 1, 2, 2, 2, 1, 1, 2, 2};      // returns 0
        int [] i = {2,2,2};                             // returns 0
    
        System.out.println(is121(a));
        System.out.println(is121(b));
        System.out.println(is121(c));
        System.out.println(is121(d));
        System.out.println(is121(e));
        System.out.println(is121(f));
        System.out.println(is121(g));
        System.out.println(is121(h));
        System.out.println(is121(i));

    }

 static  int is121(int[] a){
     /*
     Loop will count the amount of ONES on left and right, and the amount of TWOs, then compare  left ad right
     */
     int left = 0;
     int right = 0;
     int middle = 0;
     boolean flag_two = false;

    for(int i = 0; i < a.length; i++){ 
        if(a[i] == 1 & flag_two == false){
            if(a[a.length - 1 - left] == 1){
                right += 1;
            }            
            left += 1;
        }
        else{
            if(a[i] == 2){
                flag_two = true;
                middle++;
            }
        }
    }
    if(left == 0 || right == 0)
        return 0;
    if(middle == a.length - left - right & left == right)
        return 1;
    else
        return 0;
    }
}