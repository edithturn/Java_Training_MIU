public class Twinoid{

    public static void main(String [] args){ 

         int a [] = {7, 2, 9, 10, 5};   // 1
         int b [] = {4, 11, 12, 1, 6};  // 1
         int c [] = {1, 0, 5};          // 1
         int d [] = {2};                // 1
         int e [] = {2, 6, 3, 4};       // 0

        System.out.println(isWave(a));
        System.out.println(isWave(b));
        System.out.println(isWave(c));
        System.out.println(isWave(d));
        System.out.println(isWave(e));

    }

    static  int isWave (int [ ] a){

        for(int i = 0; i < a.length - 1; i++){
            if(a[i]% 2 == 0 && a[i + 1]%2 == 0)
                return 0;
            if(a[i]% 2 > 0 && a[i + 1]%2 > 0)
                return 0;
        }
    return 1;
    }
}