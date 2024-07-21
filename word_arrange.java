import java.util.*;
public class word_arrange
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=in.nextLine();
        s=s.trim()+" "; int i,c=0,l=s.length();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            c++;
        }
        String n[]=new String [c]; int x=0; char ch; String w="";
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w+=ch;
            else
            {
                n[x]=w; w=""; x++;
            }
        }
        String t; int j;
        for(i=0;i<(c-1);i++)
        {
            for(j=0;j<c-2;j++)
            {
                if(n[j].length()>n[j+1].length())
                {
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
            }
        }
        for(i=0;i<=(c-1-i);i++)
        {
            System.out.print(n[c-1-i]+" "+n[i]+" ");
        }
    }
}