import java.util.Scanner ;

public class T9c_L9v11 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( System.in ) ;
        
        int [] a = new int [15] ;
        int [] b = new int [10] ;
        
        int u ;
        
        for ( u = 0 ; u < a.length ; u ++ ) {
            
            System.out.print ( " Please enter a digit : " ) ;
            a [u] = input.nextInt() ;
            
            switch ( a [u] ) { 
                
                case 0 : b [0]++ ;
                break ;
                
                case 1 : b [1]++ ;
                break ;
                
                case 2 : b [2]++ ;
                break ;
                
                case 3 : b [3]++ ;
                break ;
                
                case 4 : b [4]++ ;
                break ;
                
                case 5 : b [5]++ ;
                break ;
                
                case 6 : b [6]++ ;
                break ;
                
                case 7 : b [7]++ ;
                break ;
                
                case 8 : b [8]++ ;
                break ;
                
                case 9 : b [9]++ ;
                break ;
                
            }
            
        }
        
        System.out.println ( " 0 is pressed " + b [0] + " times " ) ;
        System.out.println ( " 1 is pressed " + b [1] + " times " ) ;
        System.out.println ( " 2 is pressed " + b [2] + " times " ) ;
        System.out.println ( " 3 is pressed " + b [3] + " times " ) ;
        System.out.println ( " 4 is pressed " + b [4] + " times " ) ;
        System.out.println ( " 5 is pressed " + b [5] + " times " ) ;
        System.out.println ( " 6 is pressed " + b [6] + " times " ) ;
        System.out.println ( " 7 is pressed " + b [7]+ " times " ) ;
        System.out.println ( " 8 is pressed " + b [8] + " times " ) ;
        System.out.println ( " 9 is pressed " + b [9] + " times " ) ;
    }
}

            
            
            