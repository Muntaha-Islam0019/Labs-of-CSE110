public class Lab9_03 {
    
    public static void main(String args[]) {
        
        int sum = 0 ;
        
        for( int count=1 ; count<=600 ; count++ ) {
            
            if(count % 7 == 0) {
                
                sum = sum + count;
                
            }
            else if(count % 9 == 0) {
                
                sum = sum + count;
                
            }
        }
        System.out.println(" Sum = " +sum);
    }
}