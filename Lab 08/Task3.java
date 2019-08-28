import java.util.Scanner ;

public class Task3 {
    
    public static void main (String[] args) { 
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.print( " Please write quantity of lines :" ) ;
        int lineQuantity = input.nextInt() ;
        
        System.out.print( " Please write quantity of stars on each line :" ) ;
        int starQuantity = input.nextInt() ;
        
        for (int count = 1 ; count <= lineQuantity ; count++) {
            
            for (int count1 = 1 ; count1 <= starQuantity ; count1++) {
                
                System.out.print('*') ;
            }
            
            System.out.println() ;
        }
        
        
    }
}

