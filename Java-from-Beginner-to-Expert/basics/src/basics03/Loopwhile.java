
package basics03;


public class Loopwhile {

  
    public static void main(String[] args) {
        
        String[] videoCourses = 
        {
            "C",
            "C++",
            "Java",
            "JavaScript"
        
        };
        
        System.out.println(videoCourses[0]);
        
        System.out.println("WHILES");
        int i = 0;
        /*while(i < 5)
        {
            System.out.print(i);
            i ++;
        }*/
        
        do
        {
            System.out.println(videoCourses[i]);
            i++;
        }while(i < videoCourses.length);
        
        int[] values = 
        {
            10,
            20,
            30,
            40
        
        };
        
        int j = 0;
        while (j < values.length)
        {
            System.out.println(values[j]);
            j++;
        }
        
       System.out.println("FOR LOOPS");
        
        for(int x = 0; x < videoCourses.length; x++)
        {
            System.out.println(videoCourses[x]);
        }
        
        System.out.println("======");
        for(String value: videoCourses){
            System.out.println(value);
        
        }
        
        for( int z = 1; z <=10; z++)
        {
            for(int y = 1; y <=10; y++)
            {
                System.out.print(z * y + " ");
            }
            System.out.println();
        }
        
        System.out.println("CONTINUE");
        for (int a = 0; a < 10; a++){
            if(a == 6)
                continue;
            System.out.println(a);
        }
        
        System.out.println("BREAK");
        for (int b = 0; b < 10; b++){
            if(b == 6)
                break;
            System.out.println(b);
        }
        
        System.out.println("BREAK INNER FOR");
        
        for(int h=1; h <= 10; h++)
        {
            if (h % 2 != 0)
            {
                for(int l=1; l <=10; l++)
                {
                    //if(l == 5)
                    //    break;
                    System.out.print(h * l + " ");
                }
                System.out.println();

            }
            }
        
    }
    
}
