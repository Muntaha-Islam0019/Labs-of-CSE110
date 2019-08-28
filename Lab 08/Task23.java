import java.util.Scanner;


public class Task23
{
    public static void main(String[] args)
    {
        Scanner nn=new Scanner (System.in);
        int height;
        
        System.out.println("Enter a number: ");
        height=nn.nextInt();
        
        
        for(int i=1; i<=height; i++)
        {
          for(int sp=1;sp<=height-i;sp++)
          {
            System.out.print(" ");
          }
            for(int j=1; j<=(i*2-1); j++)
            {
              if (i==1 || j==1 || j==(i*2-1))
              {
                System.out.print(j);
              } 
              else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=(height);i++)
        {
          for(int sp=1;sp<=(i);sp++)
          {
            System.out.print(" ");
          }
          for(int j=1; j<=((height+(height-1))-(i*2)); j++)
          {
            if (j==1 || j==((height+(height-1))-(i*2)))
            {
              System.out.print(j);
            }
            else
            {
              System.out.print(" ");
            }
          }
          System.out.println();
        }
    }
}