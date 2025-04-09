import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class New
{
    int n, i, s = 0; 
    Scanner sc = new Scanner(System.in);// Using multiple function
    void input() 
    {
        System.out.print("\nEnter the number of term: ");
        n = sc.nextInt();
    }
    void calculate() 
    {
 
        for(i=1;i<=n;i++)
        {
           s=s+i;
        }
    }

    void output() 
    {
        System.out.println("\nSum: " + s);
    }
}

class Natural
{
    public static void main(String[] args) 
    {
        New obj = new New();
        obj.input();         
        obj.calculate();
        obj.output();        
    }
}


/*Using single function--

import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class Natural
{
    int n, i, s = 0; 
    Scanner sc = new Scanner(System.in);// Using one function
    void fn() 
    {
        System.out.print("\nEnter the number of term: ");
        n = sc.nextInt();
    
        for(i=1;i<=n;i++)
        {
           s=s+i;
        }
        System.out.println("\nSum: " + s);
    }
}

class Naturalnumbers
{
    public static void main(String[] args) 
    {
        Natural obj = new Natural();
        obj.fn();         
    }
} */