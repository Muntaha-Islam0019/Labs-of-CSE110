import java.util.Scanner ;

public class T6_L9v11 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( System.in ) ;
        
        
        System.out.print ( " Please enter the quantity : " ) ;
        int quan = input.nextInt() ;
        
        int [] a = new int [quan] ;
        int v ;
        
        for ( v = 0 ; v < a.length ; v++ ) {
            
            System.out.print ( " Please enter a number : " ) ;
            a [v] = input.nextInt() ;
            
        }
        
        for ( int i = 0 ; i < a.length ; i ++ ) { 
            
            for ( int j = i + 1 ; j < a.length ; j ++ ) {
                
                if ( a [i] > a [j] ) {
                    
                    int temp = a [i] ;
                    a [i] = a [j] ;
                    a [j] = temp ;
                    
                }
            }
        }
        
        if ( a.length % 2 == 0 )  {
            
            int mid1 = a.length / 2 - 1 ; 
            int mid2 = mid1 + 1 ;
            
            int mid = (a [mid1] + a [mid2] ) / 2 ;
            
            System.out.println ( " The median is : " + mid ) ;
            
        }
        
        else { 
            
            int mid3 = ( a.length / 2 ) ;
            
            System.out.println ( " The median is : " + a [mid3] ) ;
                
        }
        
    }
}
        
            
            
                
            
        