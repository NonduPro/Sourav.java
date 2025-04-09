import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class New
{
    int n, s=0, r; 
    Scanner sc = new Scanner(System.in);// Using single function
    void fn() 
    {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
 
        while(n!=0)
        {
           r=n%10;
           s=s*10+r;
           n=n/10;
        }
        System.out.print("\nReverse: "+s);
    }


}

class Reverse
{
    public static void main(String[] args) 
    {
        New obj = new New();
        obj.fn();              
    }
}