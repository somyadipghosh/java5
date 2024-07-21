import java.util.*;
public class word_line_sep
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=in.nextLine();
        s=s.trim(); int i,j,c=0,k;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            c++;
        }
        String n[]=new String[c+1]; i=0; String st=s+" ";
        do
        {
            k=st.indexOf(' ');
            n[i]=st.substring(0,k); i++;
            st=st.substring(k+1,st.length());
        }
        while(k!=st.length() && i<=c);
        for(i=0;i<=s.length();i++)
        {
            for(j=0;j<c+1;j++)
            {
                if(i<n[j].length())
                System.out.print(n[j].charAt(i)+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}