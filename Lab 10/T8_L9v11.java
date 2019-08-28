import java.util.Scanner ;

public class T8_L9v11 {
    
    public static void main ( String [] args ) {
        
       Scanner input = new Scanner ( System.in ) ;
        
       String [] a = { "Zero" , "One" , "Two" , "Three", "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" } ;
       
       System.out.print ( " Please enter a digit : " ) ;
       int digit = input.nextInt() ;
       
       for ( int v =0 ; v < a.length ; v++ ) {
           
           if ( digit == v ) {
               
               System.out.println ( a [v] ) ;
               
           }
           
       }
       
    }
}