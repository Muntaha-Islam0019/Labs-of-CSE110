import java.util.Scanner ;

public class Task1 
{
    
    public static void main (String[] args) 
    
    {
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.println( " Please write quantity of columns " ) ;
        int columnQuantity = input.nextInt() ;
        
        
        for (int count = 1 ; count <= columnQuantity ; count++)
        {
            System.out.print( count ) ;
        }
        
        System.out.println() ;
    }
}
        
        