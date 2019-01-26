import java.io.*;
import java.util.*;
class Messi
{
    public static void main(String[]args)throws IOException
    {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int a[] = new int[n];
        int sum=0;

        for(int i=0;i<n;i++)
        {
            a[i]=S.nextInt();
        }

        for(int i=0;i<n;i++)
        {
          sum+=a[i];
        }
        System.out.println(sum);
    }
}