import java.util.*;

class A 
{
   int s=0,r;

   A(int n) //Reverse a number using Parameterised Constructor 
   {
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.print("\nThe reverse number is: "+s);
   }
       
}
class ReverseNumber
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        A obj = new A(n);
       
    }
}