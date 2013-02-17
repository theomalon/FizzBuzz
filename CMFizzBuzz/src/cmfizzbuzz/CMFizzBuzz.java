/*
 * Chris Malon
 * 2/13/13
 * FizzBuzz
 */
package cmfizzbuzz;

/**
 *
 * @author zero
 */
public class CMFizzBuzz {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i < 101; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            
            else
            System.out.println(i);
        }
    }
}
