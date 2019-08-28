public class Lab9_01b {
    
    public static void main (String args[]) {
        
        for(int n=-10;n<=20;n=n+5) {
            
            System.out.print (n);
            
            if(n==20) {
                
                break;
                
            }
            System.out.print(" , ");
        }
    }
}