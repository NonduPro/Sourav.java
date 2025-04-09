import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class Fact
{
    int n, i, f=1; 
    Scanner sc = new Scanner(System.in);// Using multiple function
    void input() 
    {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
    }
    void calculate() 
    {
 
        for(i=n;i>=1;i--) //[while(n!=0)--{1. f = f * n;2. n--;}] 
        {
           f=f*i;
        }
    }

    void output() 
    {
        System.out.print("\nFactorial: " + f);
    }
}

class Factorial
{
    public static void main(String[] args) 
    {
        Fact obj = new Fact();
        obj.input();         
        obj.calculate();
        obj.output();        
    }
}