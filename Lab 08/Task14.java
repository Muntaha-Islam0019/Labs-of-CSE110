import java.util.Scanner ;

public class Task14 {
    
    public static void main (String[] args) { 
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.print( " Please write quantity of lines :" ) ;
        int quanLine = input.nextInt() ;
        
        System.out.print( " Please write quantity of columns :" ) ;
        int quanColumn = input.nextInt() ;
        
        
        
        
        for (int numLine = 1 ; numLine <= quanLine ; numLine++) {
            
            
            
            for (int numColumn = 1 ; numColumn <= quanColumn ; numColumn++) {
                
                if ( numLine == 1 || numLine == quanLine || numColumn == 1 || numColumn == quanColumn ) {
                    
                    System.out.print('*') ;
                }
                else {
                    
                    System.out.print(" ") ;
                }
            }
            
            System.out.println() ;
        }
        
        
        
    }
}

