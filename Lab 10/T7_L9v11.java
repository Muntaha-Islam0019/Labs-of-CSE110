import java.util.Scanner ;

public class T7_L9v11 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( System.in ) ;
        
        int [] a = new int [10] ;
        int v ;
        
        for ( v = 0 ; v < a.length ; v++ ) {
            
            System.out.print ( " Please enter a number : " ) ;
            a [v] = input.nextInt() ;
            
        }
        
        
        for ( v = 0 ; v < a.length ; v = v + 2 ) {
            
            System.out.println ( a [v] ) ;
            
        }
        
        for ( v = 1 ; v < a.length ; v = v + 2 ) {
            
            System.out.println ( a [v] ) ;
            
        }
        
    }
    
}