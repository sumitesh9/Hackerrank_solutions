import java.util.*;
import java.io.*;
class Messi
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int count = 0;
            int constant = 0;
            int sum = 0;
            while(count < n)
            {
                if(count == 0)
                {
                    constant = 1;
                    sum = a + (constant*b) + sum;
                }
                    else
                {
                    constant = constant * 2;
                    sum = (constant * b) + sum;
                }
                System.out.print (sum + " ");
                count += 1;
            }
        System.out.println();       
        }
        in.close();
    }
}