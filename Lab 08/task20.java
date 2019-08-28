import java.util.Scanner;


public class task20
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        
        
        int height;
        
        
        height=sc.nextInt();
        
        
        for(int i=1;i<=height;i++)
        {
            for(int sp=1;sp<=height-i;sp++)
            {System.out.print(" ");}
            
            for(int j=1;j<=(i*2-1);j++)
                
            {
                if (i==1||i==height||j==1||j==(i*2-1))
                {System.out.print("*");
                }
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}