import java.util.Scanner ;

public class Task10 {
    
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
            
                int columnCount = 1 ;
            
            while (columnCount <= 2*numLine - 1) {
                
                System.out.print(columnCount) ;
                columnCount++ ;
            }
            
            
            System.out.println() ;
            numLine++ ;
        }
    }
}

        
            
