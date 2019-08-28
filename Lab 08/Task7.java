import java.util.Scanner ;

public class Task7 {
    
    public static void main (String[] args) { 
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.print (" Please enter the quantity of lines ") ;
        int quanLine = input.nextInt() ;
        
        int numLine = 1 ;
        
        while (numLine <= quanLine) {
           
            int spaceCount = 1 ;
            
            while (spaceCount <= quanLine - numLine) {
            
                System.out.print(" ") ;
                spaceCount++ ;
            }
            
                int starCount = 1 ;
            
            while (starCount <= numLine) {
                
                System.out.print("*") ;
                starCount++ ;
            }
            
            
            System.out.println() ;
            numLine++ ;
        }
    }
}

        
            
