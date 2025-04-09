import java.util.*;

class A 
{
    int n, i, j, c;
    Scanner sc = new Scanner(System.in);

    void input() 
    {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }

    void calculate() 
    {   
        System.out.print("\nFactors of the number are: ");   
        for (i = 1; i <= n; i++) 
        {
            if (n % i == 0) 
            {
                System.out.print(i + " ");
            }
        }
        
        System.out.print("\nPrime factors are: "); 
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0) 
            {
                c = 0;
                for (j = 1; j <= i; j++)
                {
                    if (i % j == 0)
                    {
                        c++;
                    }
                }
                if (c == 2)
                {
                    System.out.print(i + " ");  
                }
            }
        }
    }
}

class PrimeFactors
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}


/*Only change in the output style--

import java.util.*;

class A 
{
    int n, i, j, c;
    Scanner sc = new Scanner(System.in);

    void input() 
    {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }

    void calculate() 
    {   
        for (i = 1; i <= n; i++) 
        {
            if (n % i == 0) 
            {
                System.out.print("\nFactor of the number is: " +i); 
            }
        }
        
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0) 
            {
                c = 0;
                for (j = 1; j <= i; j++)
                {
                    if (i % j == 0)
                    {
                        c++;
                    }
                }
                if (c == 2)
                {
                    System.out.print("\nPrime factors is: " +i); 
                }
            }
        }
    }
}

class PrimeFactors
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}

 */
