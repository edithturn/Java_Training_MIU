class StuffArray{

public static void main(String [] args){

    int a [] =  {7, 6, 10, 1}; // 1
    int b [] =  {7, 6, 10};    // 0
    int c [] =  {6, 10, 1};    // 0
    int d [] =  {1, 6, 10, 11};// 1
    int e [] =  {5, 10, 1};    // 1

    System.out.println(isMeera(a));
    System.out.println(isMeera(b));
    System.out.println(isMeera(c));
    System.out.println(isMeera(d));
    System.out.println(isMeera(e));
}

static  int isMeera (int [ ] a){

    int one_present = 0;
    int one_prime = 0;

    for(int x : a){
        if(x == 1)
            one_present = 1;
        if(x != 1 && checkPrime(x) == 1)
            one_prime = 1;
    }
    if(one_present == 1 && one_prime == 1)
        return 1;
    else 
        return 0;

}

static int checkPrime(int n){

    int iter = 2;

    while(iter < n){
        if(n%iter == 0)
            return 0;
        iter++;
    }
    return 1;
    }
}

