import java.util.Scanner ;

public class T9a_L9v11 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( System.in ) ;
        
        int [] a = new int [15] ;
       
        int u , v , count ;
        
        for ( u = 0 ; u < a.length ; u ++ ) {
            
            System.out.print ( " Please enter a digit : " ) ;
            a [u] = input.nextInt() ;
            
        }
        
        for ( v = 0 ; v < 10 ; v  ++ ) { 
            
            
            for ( u = 0 , count = 0 ; u < a.length ; u  ++ ) { 
                
                if ( v == a [u] ) {
                    
                    count ++ ;
                    
                }
            }
            
            System.out.println ( v + " is pressed " + count + " times " ) ;
            
        }
        
    }
    
}