import java.util.*;

public class Lab9_06 {
    
    public static void main( String args[] ) {
        
        Scanner x=new Scanner(System.in);
        
        System.out.println (" Please enter a quantity ");
        int Q = x.nextInt() ;
        
        for(int count=1 ; count <= Q ; ++count) {
            
            System.out.println (" Please enter a number ");
            int n = x.nextInt() ;
            
            if(n%2 == 0) {
                System.out.println(" even ") ; 
            }
            else {
                System.out.println(" odd ") ;
            }
        }
    }
}