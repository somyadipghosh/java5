import java.util.*;
public class word_arrange2
{
    String rev(String s)
    {
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        r+=s.charAt(i);
        return r;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        word_arrange2 ob=new word_arrange2();
        System.out.println("Enter the word in capital letters");
        String s=in.next();
        s=s.trim().toUpperCase(); int l=s.length();
        int i,k,a,j=1,x=3; String st,stt;
        for(i=0;i<(l*2-1);i++)
        {
            if(i<l)
            {
                st=s.substring(0,(i+1));
                System.out.print(st);
                for(k=j;k<=(l*2-1);k++)
                System.out.print(" ");
                System.out.print(ob.rev(st));
                j+=2;
            }
            else
            {
                stt=s.substring(0,(2*l-i-1));
                System.out.print(stt);
                for(a=0;a<x;a++)
                System.out.print(" ");
                System.out.print(ob.rev(stt));
                x+=2;
            }
            System.out.println();
        }
    }
}