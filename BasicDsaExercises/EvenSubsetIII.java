// An integer is defined to be an even subset of another integer n if every even factor of m is also a  factor of n. 
// For example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and  these are both factors of 12. 
// But 18 is not an even subset of 32 because 6 is not a factor of 32. 
// Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset  of n,
// otherwise it returns 0.

// Example 01
// m = 18: 18 9 6 3 2 1 | 6 2 => return 1
// n = 12: 12 6 4 3 2 1 | 6 4 2

// Example 02
// m = 18: 18  9 6 3 2 1  | 18 6 2 => return 0
// n = 32: 32 16 8 4 2 1 | 16 8 4 2


public class EvenSubsetIII{

    public static void main(String [] args){

        System.out.println(isEvenSubset(18, 12)); // 1
        System.out.println(isEvenSubset(18, 32)); // 0
        System.out.println(isEvenSubset(16, 24)); // 1
    }

    static int isEvenSubset(int m, int n){

        int flag = 0;
        int count = 0;

        for(int i = 2; i <= m/2; i++){            
            if (m % i == 0 & i % 2 == 0){
                for (int j = 2; j <= n/2; j++ ){   
                    if (n % j == 0 & j % 2 == 0){
                        if (j == i){
                            flag += 1;
                            break;
                        }
                    }
                }
                count += 1;
            }
        }
        if (flag == count)
            return 1;
        return 0;
    }
}