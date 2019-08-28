import java.util.Scanner ;

public class Task12 {
    
    public static void main (String[] args) { 
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.print (" Please enter the quantity of lines ") ;
        int quanLine = input.nextInt() ;
        
        int numLine = 1 ;
        int loopCount = 1 ;
        
        while (loopCount <= 2*quanLine - 1) {
            
            if ( loopCount > quanLine ) {
                
                numLine = 2*quanLine - loopCount ;
            }
            else {
                
                numLine = loopCount ;
                
            }
            
            
            int spaceCount = 1 ;
            
            while (spaceCount <= quanLine - numLine ) {
            
                System.out.print(" ") ;
                spaceCount++ ;
            }
            
                int starCount = 1 ;
            
            while (starCount <= 2*numLine - 1) {
                
                System.out.print("*") ;
                starCount++ ;
            }
            
            
            System.out.println() ;
            loopCount++ ;
        }
    }
}


        
            
