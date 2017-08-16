import java.io.*;
import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
    
        Scanner s=new Scanner(System.in);
        int i=0;
               int n=s.nextInt();
        String str[]=new String[n];
        for(i=0;i<n;i++)
        {
        str[i]=s.next();
        
        
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.print(str[i]+" ");
        }
    }
}
