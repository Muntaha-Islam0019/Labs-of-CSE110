import java.util.Scanner ;

public class Task5 {
    
    public static void main (String[] args) { 
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.print (" Please enter the quantity of lines ") ;
        int quanLine = input.nextInt() ;
        
        int numLine = 1 ;
        
        while (numLine <= quanLine) {
            
            int starCount = 1 ;
            
            while (starCount <= numLine) {
                
                System.out.print('*') ;
                starCount++ ;
            }
            
            
            System.out.println() ;
            numLine++ ;
        }
    }
}

        
            
