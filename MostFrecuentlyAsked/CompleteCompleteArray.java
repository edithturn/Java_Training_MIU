class CompleteCompleteArray{

    public static void main(String [] args){

        int a [] = {2, 3, 2, 4, 11, 6, 10, 9, 8};
        int b [] = {2, 3, 3, 6};
        int c [] = {2, -3, 4, 3, 6};

        System.out.println(isComplete(a)); //1
        System.out.println(isComplete(b)); //0
        System.out.println(isComplete(c)); //0

    }

     static int isComplete (int[ ] a){

        int max = 0;
        for(int x: a){
            if(x > 0){
                if(x % 2 == 0)
                    if(x > max)
                        max = x;
            }
            else
                return 0;
        }

        int n = 2;
        int flag = 0;

        while(n < max){
            if(n % 2 == 0){
                for(int i = 0; i < a.length; i++){
                    if( n == a[i]){
                        flag = 1;
                        break;
                    }
                    else
                        flag = 0;
                }
                if(flag == 0)
                    return 0;
            }
            n++;
        }
        return flag;
     }

}