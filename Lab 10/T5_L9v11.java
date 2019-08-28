import java.util.Scanner ;

public class T5_L9v11 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( System.in ) ;
        
        int [] a = new int [5] ;
        int v ;
        
        for ( v = 0 ; v < a.length ; v++ ) {
            
            System.out.print ( " Please enter a number : " ) ;
            a [v] = input.nextInt() ;
            
        }
        
        for ( int i = 0 ; i < a.length ; i ++ ) { 
            
            for ( int j = i + 1 ; j < a.length ; j ++ ) {
                
                if ( a [i] < a [j] ) {
                    
                    int temp = a [i] ;
                    a [i] = a [j] ;
                    a [j] = temp ;
                    
                }
            }
        }
        
        for ( int x = 0 ; x < a.length ; x ++ ) {
            
            System.out.println (a [x] ) ;
            
        }
    }
}
            
            
        