import java.util.Scanner ;

public class Task4 {
    
    public static void main (String[] args) { 
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.print (" Please enter the quantity of lines ") ;
        int quanLine = input.nextInt() ;
        
        System.out.print (" Please enter the quantity of column ") ;
        int quanColumn = input.nextInt() ;
        
        int numLine = 1 ;
        
        while (numLine <= quanLine) {
            
            
            int numColumn = 1 ;
            
            while (numColumn <= quanColumn) {
                
                System.out.print (numColumn) ;
                
                numColumn++ ;
            }
            
            
            
            System.out.println() ;
            
            numLine ++ ;
        }
    }
}
            
            