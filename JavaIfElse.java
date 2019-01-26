import java.util.Scanner;
import java.io.*;
class Messi
{
    public static void main(String[]args)throws IOException
    {
         Scanner S=new Scanner(System.in);
         int n=S.nextInt();
         if(n%2!=0)
         System.out.println("Weird");
         else
         {
             if(n>=2&&n<=5)
             System.out.println("Not Weird");
             if(n>=6&&n<=20)
             System.out.println("Weird");
             if(n>20)
             System.out.println("Not Weird");
         }
    }
}