class IsSym{
    
    public static void main(String [] args){

        int a [] = {2, 7, 9, 10, 11, 5, 8}; // 1
        int b [] = {9, 8, 7, 13, 14, 17};   // 1 
        int c [] = {2, 7, 8, 9, 11, 13, 10}; // 0
        
        System.out.println(isSym(a));
        System.out.println(isSym(b));
        System.out.println(isSym(c));
    }


    static int isSym (int [ ] a){

        boolean flag = false;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0 && a[a.length -1 - i] % 2 == 0 || a[i] % 2 > 0 && a[a.length -1 - i] % 2 > 0 )
                flag = true;
            else
                return 0;
            
            if(i == a.length/2)
                break;
        }
        
        if (flag == true)
            return 1;
        return 0;
    }
}