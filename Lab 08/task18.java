import java.util.Scanner;

public class task18
{
    public static void main (String[] args)
    {
        
        Scanner sc=new Scanner (System.in);
        
        int height;
        height=sc.nextInt();
        
        
        for(int i=1;i<=height;i++)
            
        {
            for(int sp=1;sp<=(height-i);sp++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=i;c++)
            { 
                if(i==1||i==height||i==2||c==1||c==i)
                {System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }
            
    }
}
