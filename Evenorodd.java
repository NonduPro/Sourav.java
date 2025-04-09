import java.util.*;// VS code shows that import java.io.; not required
                   // Also we can write import java.util.Scanner; //If we need only one class
class New
{
    int n;
    Scanner sc=new Scanner(System.in);// Using one function
    void fn()
    {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
        if(n%2==0)
        {
            System.out.print("The number " +n+ " is even.");
        }
        else
        {
            System.out.print("The number " +n+ " is odd.");
        }
    }
}
class Evenorodd
{
    public static void main(String[] args) 
    {
        New obj = new New();
        obj.fn();
    }
}