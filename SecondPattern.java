import java.util.*;

class A 
{
    int line, i, j;
    Scanner sc = new Scanner(System.in);

    void fn()
    {
        System.out.print("Enter Number of lines: "); 
        line = sc.nextInt();

        for (i = 1; i <= line; i++) 
        {
            // Printing increasing numbers
            for (j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }  
            
            System.out.println(); // or System.out.print("\n"); 
        }
        
        for (i = line - 1; i >= 1; i--) 
        {
            // Printing decreasing numbers
            for (j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }  
            
            System.out.println(); // or System.out.print("\n");
        }
    }
}

class SecondPattern
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.fn();
    }
}

/* Using multiple functions-

import java.util.*;

class A
{
    int line,i,j;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("Enter a number: ");
        line = sc.nextInt();
    }
    void calculate()
    {
        for(i=1;i<=line;i++)
        {     
            for(j=1;j<=i;j++)
            {
                System.out.print(j);  
            }
            System.out.print("\n");
        }
        for(i=line-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");   
        }
    }
}
class SecondPattern
{
    public static void main(String[] args) 
    {   
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}
*/