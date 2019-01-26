import java.util.Scanner;
class Messi 
{
    public static void main(String[]args)
    {
        Scanner S=new Scanner(System.in);
        int t=S.nextInt();
        while(t-->0)
        {
            int g=S.nextInt();
            if(g>=38)
            {
            if(g%5==3)
            g+=2;
            if(g%5==4)
            g+=1;
            }
            System.out.println(g);
        }
    }
}