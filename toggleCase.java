import java.util.*;
public class toggleCase
{
    public static void main(String args[])
    {
        String s,s1="";
        int l,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122)
            ch-=32;
            else if(ch>=65 && ch<=90)
            ch+=32;
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}