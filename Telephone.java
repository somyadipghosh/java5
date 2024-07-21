//Calculating the tax of an employee
import java.util.*;
public class Telephone //Q5
{
    int prv,pre,call;
    String name;
    double amt,total;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME OF CUSTOMER: ");
        name=sc.nextLine();
        System.out.println("Enter the previous meter reading: ");
        prv=sc.nextInt();
        System.out.println("Enter the present meter reading: ");
        pre=sc.nextInt(); //mismatch exception
    }
    void cal()
    {
        if(call<=100)
        amt=0;
        else if(call>=100 && (call<200))
        amt=0+(call-100)*90.0/100;
        else if(call>=200 && call<=400)
        amt=0+(100*90.0/100)+(call-200)*80/100;
        else
        amt=0+(100*90.0/100)+(200*80.0/100)+(call-400)*70.0/100;
        total=amt*call;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Calls made : "+call);
        System.out.println("Amount : Rs."+amt);
        System.out.println("Total Amount : Rs."+total);
    }
    public static void main(String args[])
    {
        Telephone ob=new Telephone();
        ob.input();
        ob.cal();
        ob.display();
    }
}