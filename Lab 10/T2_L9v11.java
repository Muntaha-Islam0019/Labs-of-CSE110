import java.util.Scanner ;

public class T2_L9v11 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( System.in ) ;
        
        int [] a = new int [5] ;
        int v , max , loc = 0;
        
        System.out.print ( " Please enter first number : " ) ;
        a [0] = input.nextInt() ;
        
        max = a [0] ; 
        
        for ( v = 1 ; v < a.length ; v++ ) {
            
            System.out.print ( " Please enter another number : " ) ;
            a [v] = input.nextInt() ;
            
            if ( max < a [v] ) {
                
                max = a [v] ;
                loc = v ;
               
            }
            
        }
        
        System.out.println ( " Largest number " + max + " was found at location " + loc ) ;
        
    }
}
