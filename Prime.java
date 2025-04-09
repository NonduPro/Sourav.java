import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class New
{
    int n, i, c = 0; 
    Scanner sc = new Scanner(System.in);// Using multiple function
    void input() 
    {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
    }
    void calculate() 
    {
 
        for(i=1;i<=n;i++)
        {
           if(n%i==0)
           {
                c=c+1;
           }
        }
    }

    void output() 
    {
        if(c==2)
        {
            System.out.print("\nIt is a prime number");
        }
        else
        {
            System.out.print("\nIt is not a prime number");
        }
    }
}

class Prime
{
    public static void main(String[] args) 
    {
        New obj = new New();
        obj.input();         
        obj.calculate();
        obj.output();        
    }
}