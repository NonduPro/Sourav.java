import java.util.*;

class A
{
    int lines, i, j;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("Enter the number of lines: "); 
        lines = sc.nextInt();
    }
    void calculate()
    {
        for (i = 1; i <= lines; i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print(1 + " " ); //Here if we put 0 to print and 1 for the else part it will print the opposite pattern
                }
                else
                {
                    System.out.print(0 + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
class Patterns
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}

/* Using Parameterized constructor--

import java.util.*;

class A
{
    int i, j;
    
    A(int lines)
    {
        
        for (i = 1; i <= lines; i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j) % 2 == 0) 
                {
                    System.out.print(1 + " " ); 
                }
                else
                {
                    System.out.print(0 + " ");
                }
            }
            System.out.print("\n"); 
        }
    }
}
class Patterns
{
    public static void main(String[] args)
    {
        int lines;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: "); 
        lines = sc.nextInt();
        A obj = new A(lines); 
        sc.close();
    }
}
 */