import java.util.*;
public class vowelnext
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,s1="";
        int l,i;
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            s=s.toUpperCase( );
            char ch=s.charAt(i);
            if(ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
            s1+=(char)(ch+1);
            }
            else
            {
            s1+=ch;
            }
        }
        System.out.println(s1);
    }
}