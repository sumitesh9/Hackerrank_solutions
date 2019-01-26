import java.io.*;
import java.util.Scanner;
class Messi
{
    public static void main(String[]args)throws IOException
    {
        Scanner S=new Scanner(System.in);
        String s=S.nextLine();
        int res=1;

        for(int i=1;i<s.length();i++)
        {
            int asc=(int)s.charAt(i);
            if(asc>=65&&asc<=90)
            res++;
        }
        System.out.println(res);
    }
}