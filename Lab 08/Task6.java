import java.util.Scanner ;

public class Task6 {
    
    public static void main (String[] args) { 
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.print (" Please enter the quantity of lines : ") ;
        int quanLine = input.nextInt() ;
        
        
        
        int numLine = 1 ;
        
        while (numLine <= quanLine) {
            
            int numColumn = 1 ;
            
            while (numColumn <= numLine) {
                
                System.out.print(numColumn) ;
                numColumn++ ;
            }
            
            
            System.out.println() ;
            numLine++ ;
        }
    }
}

        
            
