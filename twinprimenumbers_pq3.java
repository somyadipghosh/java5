import java.util.*;
public class twinprimenumbers_pq3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,p;
        System.out.println("Enter range of numbers:");
        n=sc.nextInt();
        boolean prime[]=new boolean[n+1];
        for(i=0;i<=n;i++)
        prime[i]=true;
        for(p=2;p*p<=n;p++)
        {
            if(prime[p]==true)
            {
                for(i=p*2;i<=n;i+=p)
                prime[i]=false;
            }
        }
        for(i=2;i<=n;i++)
        {
            if(prime[i]==true && prime[i+2]==true)
            System.out.println("("+i+", "+(i+2)+")");
        }
    }
}