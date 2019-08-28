public class Lab9_11 {
    
    public static void main(String args[]) {
        
        int divcnt=0 , div=1 , N=40 ;
        
        while( N <= 50 ) {
            divcnt=0;
            div=1;
            while(div <= N) {
                if(N%div==0) {
                    divcnt++ ;
                }
                div++ ;
            }
            if(divcnt==2) {
                System.out.println (N);
            }
            N++;
        }
    }
}