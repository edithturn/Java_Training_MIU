// Example
// 18  1 2 3 6 9 18 | 2 6
// 12  1 2 3 4 6 12 | 2 6
// 18  1 2 3 6 9 18   | 2 6
// 32  1 2 4 8 16 32  | 2


public class IsEvenSubset{

    public static void main( String [] args){

        //System.out.println(isEvenSubset(18, 12));        
        System.out.println(isEvenSubset(18, 32));
    }

    static int isEvenSubset(int m, int n){

        int flag = 0;
        int m_count = 0;
        int n_count = 0;

        for(int i = 1; i < m; i++){
            if(m % i == 0 & i % 2 == 0){
                m_count++;
                for(int j = 1; j < n; j++){     
                    if(n % j == 0 & j % 2 == 0){
                        if(i == j){
                            n_count++;
                            flag = 1;
                        }
                    }
                }
            }
        }
        System.out.println(m_count);  
        System.out.println(n_count);  
        if (m_count == n_count & flag == 1)
            return 1;
        else
            return 0;

    }

}

 