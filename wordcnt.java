import java.util.*;
public class wordcnt
{
    public static void main(String args[])
    {
        String s;
        int l,i,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a snetence: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
            c++;
        }
        System.out.println("No. of Words : "+c);
    }
}