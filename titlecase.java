import java.util.*;
public class titlecase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s,s1="";
        int l,i,f=1;
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(f==1)
            {
                if(ch>=97&&ch<=122)
                ch-=32;
                f=0;
            }
            if(ch==' ')
            f=1;
            s1=s1+ch;
        }
        System.out.println("Title case: "+s1);
    }
}