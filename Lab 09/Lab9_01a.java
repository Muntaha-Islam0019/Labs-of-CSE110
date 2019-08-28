public class Lab9_01a {
    
    public static void main ( String [] args ) {
        
        for ( int n = 24 ; n >= -6 ; n = n-6 ) {
            
            System.out.print ( n );
            
            if(n==-6) {
                
                break ;
            }
            
            System.out.print ( " , " ) ;
            
        }
    }
}