import java.util.Scanner ;

public class T9b_L9v11 {
    
    public static void main ( String [] args ) {
        
        Scanner input = new Scanner ( System.in ) ;
        
        int [] a = new int [15] ;
        
        int u , zeroC = 0 , oneC  = 0 , twoC  = 0 , threeC  = 0 , fourC  = 0 , fiveC  = 0 , sixC = 0 , sevenC = 0 , eightC = 0 , nineC  = 0 ;
        
        for ( u = 0 ; u < a.length ; u ++ ) {
            
            System.out.print ( " Please enter a digit : " ) ;
            a [u] = input.nextInt() ;
            
            switch ( a [u] ) { 
                
                case 0 : zeroC++ ;
                break ;
                
                case 1 : oneC++ ;
                break ;
                
                case 2 : twoC++ ;
                break ;
                
                case 3 : threeC++ ;
                break ;
                
                case 4 : fourC++ ;
                break ;
                
                case 5 : fiveC++ ;
                break ;
                
                case 6 : sixC++ ;
                break ;
                
                case 7 : sevenC++ ;
                break ;
                
                case 8 : eightC++ ;
                break ;
                
                case 9 : nineC++ ;
                break ;
                
            }
            
        }
        
        System.out.println ( " 0 is pressed " + zeroC + " times " ) ;
        System.out.println ( " 1 is pressed " + oneC + " times " ) ;
        System.out.println ( " 2 is pressed " + twoC + " times " ) ;
        System.out.println ( " 3 is pressed " + threeC + " times " ) ;
        System.out.println ( " 4 is pressed " + fourC + " times " ) ;
        System.out.println ( " 5 is pressed " + fiveC + " times " ) ;
        System.out.println ( " 6 is pressed " + sixC + " times " ) ;
        System.out.println ( " 7 is pressed " + sevenC + " times " ) ;
        System.out.println ( " 8 is pressed " + eightC + " times " ) ;
        System.out.println ( " 9 is pressed " + nineC + " times " ) ;
    }
}

            
            
            