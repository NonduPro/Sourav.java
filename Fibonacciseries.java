import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class Fibonacci
{
    int n, a, b, c; 
    Scanner sc = new Scanner(System.in);// Using multiple function
    void input()
    {
        System.out.print("\nEnter value of n: ");
        n = sc.nextInt();
        a=0;
        b=1;
    }
    void calculate()
    {    
        System.out.print("\nThe fibonacci series is: " +a+" "+b+" ");  
    }
    void output()
    {
        c=a+b;
        while(c<=n)
        {
            System.out.print(c +" ");
            a=b;
            b=c;
            c=a+b;
        }
        
    }
}

class Fibonacciseries
{
    public static void main(String[] args) 
    {
        Fibonacci obj = new Fibonacci();
        obj.input();
        obj.calculate();
        obj.output();         
    }
}

/* Using one function--

import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class Fibo
{
    int n, a, b, c; 
    Scanner sc = new Scanner(System.in);// Using single function
    void fn()
    {
        System.out.print("\nEnter value of n: ");
        n = sc.nextInt();
        a=0;
        b=1;
        System.out.print("\nThe fibonacci series is: " +a+" "+b+" ");
        c=a+b;
        while(c<=n)
        {
            System.out.print(c +" ");
            a=b;
            b=c;
            c=a+b;
        }
        
    }
}

class Fibonacci
{
    public static void main(String[] args) 
    {
        Fibo obj = new Fibo();
        obj.fn();         
    }
} */