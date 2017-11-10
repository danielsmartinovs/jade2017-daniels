/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciwarmup;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m7_martin_d
 */
public class FibonacciWarmup {
    static int n1=0, n2=1, n3=0;   
    
    static List<Integer> fibonacciList = new ArrayList<Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if (args.length > 0) {
            
            if (FibonacciWarmup.isStringInt(args[0]))
            {
                
                int fibonacci_input = Integer.parseInt(args[0]);

                fibonacciList.clear();

                for (int i = 0; i <= fibonacci_input; i++)
                {
                    int fib_result = FibonacciWarmup.fibonacci(i);

                    fibonacciList.add(fib_result);
                }

                int size = fibonacciList.size();

                int[] fibonacciArray = new int[size];
                Integer[] temp = fibonacciList.toArray(new Integer[size]);

                for (int n = 0; n < size; ++n) {
                    fibonacciArray[n] = temp[n];

                    System.out.println(fibonacciArray[n]);
                }
            
            }
            
        }
        
    }
    
    static public int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
          return 1;
       else
          return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    static public boolean isStringInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
    
}
