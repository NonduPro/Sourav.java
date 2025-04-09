import java.util.*;// VS code shows that import java.io.; not required
                   // Also we can write import java.util.Scanner; //If we need only one class
class New
{
    int n, s=0, i;
    Scanner sc=new Scanner(System.in);// Using one function
    void fn()
    {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
        
        for(i=1;i<n;i++)// TO reduce loops for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.print("The number " +n+ " is a perfect number.");
        }
        else
        {
            System.out.print("The number " +n+ " is not a perfect number.");
        }
    }
}
class Perfect
{
    public static void main(String[] args) 
    {
        New obj = new New();
        obj.fn();
    }
}