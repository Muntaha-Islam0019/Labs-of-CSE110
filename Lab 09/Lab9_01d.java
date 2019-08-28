public class Lab9_01d {
    
    public static void main(String args[]) {
        
        for(int n = 18 ; n <=63 ; n = n+9 ) {
            
            if(n % 2 == 0) {
                
                System.out.print ( n );
            }
            else {
                System.out.print("-"+n);
            }
            if(n == 63) {
                break ;
            }
            System.out.print(" , ");
        }
    }
}