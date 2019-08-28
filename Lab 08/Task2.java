import java.util.Scanner ;

public class Task2 
{
    
    public static void main (String[] args) 
    
    {
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.println( " Please write quantity of stars " ) ;
        int starQuantity = input.nextInt() ;
        
        
        for (int count = 1 ; count <= starQuantity ; count++)
        {
            System.out.print( "* " ) ;
        }
        
        System.out.println() ;
    }
}
        
        