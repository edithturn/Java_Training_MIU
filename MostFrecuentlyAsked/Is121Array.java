class Is121Array{
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
    
        System.out.println(is121Array(a));
        System.out.println(is121Array(b));
        System.out.println(is121Array(c));
        System.out.println(is121Array(d));
        System.out.println(is121Array(e));
        System.out.println(is121Array(f));
        System.out.println(is121Array(g));
        System.out.println(is121Array(h));
        System.out.println(is121Array(i));

    }

    static int is121Array(int[ ] a){

        int count = 0;
        int f_count = 0;
        int s_count = 0;
        int two_count = 0;
        int flag = 0;
        // {1,2,1};
        if(a[0] == 1 && a[a.length - 1] == 1){
            for(int i = 0; i < a.length; i++){
                if(flag == 0 && a[i] == 1)
                    f_count++;    
                if(a[i] == 2){
                    two_count++;
                    flag = 1;
                }
                if(flag == 1 && a[i] == 1)
                    s_count++;  
            }
        }
        else{
            return 0;
        }
    
    if(s_count == f_count && s_count + f_count + two_count == a.length)
        return 1;
    else
        return 0;

    }
}