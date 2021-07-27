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
     int one_left = 0;
     int one_right = 0;
     int middle = 0;

     if (a[0] != 1 || a[a.length - 1] != 1)
        return 0;

    int k = 0;  //{1,1,1,1,1,1}; 
    while(a[k] == 1){
        if (a[k] > 2 & a[k] < 1)
            return 0;
        one_left += 1;
        k += 1;
        if (k == a.length - 1)
            return 0;
    }
    int m = k; 
    while(a[m] == 2){
        if (a[m] > 2 & a[m] < 1)
            return 0;
        middle += 1;
        m += 1;
    }

    int l = a.length - 1;
    while(a[l] == 1){
        if (a[l] > 2 & a[l] < 1)
            return 0;
        one_right += 1;
        l -= 1;
    }

    //System.out.println("left" + one_left);
    //System.out.println("middle" + middle);
    //System.out.println("right" + one_right);
    if (one_left == a.length ||  one_right ==  a.length || one_left + middle + one_right != a.length)
        return 0;

    if (one_left == one_right){
        return 1;
    }
    else
        return 0; 
    }
}