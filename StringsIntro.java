import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");

        StringBuffer tempA = new StringBuffer(A);
        StringBuffer tempB = new StringBuffer(B);
         char a = tempA.charAt(0);
         char b = tempB.charAt(0);
         a=Character.toUpperCase(a);
         b=Character.toUpperCase(b);
         
         String sa = Character.toString(a);
         String sb = Character.toString(b);
         tempA.replace(0,1,sa);
         tempB.replace(0,1,sb);

         System.out.println(tempA+" "+tempB);
    }
}