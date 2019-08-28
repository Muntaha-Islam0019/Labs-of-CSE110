import java.util.* ;

public class Lab9_10 {
    
    public static void main (String args[]) {
        
        Scanner x=new Scanner (System.in) ;
        
        System.out.print ( " Please Enter a number : " ) ;
        int N = x.nextInt() , divcnt=0 ;
        
        for (int div=1;div<=N;++div) {
            
            if(N%div==0){
                divcnt++;
            }
        }
        if(divcnt==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        
    }
}