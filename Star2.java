import java.util.*;

class A 
{
    int line, i, j, k;
    Scanner sc = new Scanner(System.in);
    void input()
    {    
        System.out.print("Enter the number of lines: ");   
        line = sc.nextInt();
    }
    void calculate()
    { 
        for(i=1;i<=line;i++)
        {   
            for(j=line;j>=i;j--)
            {
                System.out.print("* ");   
            }
            
            System.out.print("\n");
            
            for(k=j+1;k>=1;k--)
            {
                System.out.print(" ");
            }
        }
    }
}
class Star2
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}

/*Reverse pattern-

import java.util.*;

class A 
{
    int line, i, j, k;
    Scanner sc = new Scanner(System.in);
    void fn()
    {    
        System.out.print("Enter the number of lines: ");
        line = sc.nextInt();
        for(i=1;i<=line;i++)
        {   
            for(k=i;k<line;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
            System.out.print("\n");
            
        }
    }
}
class Star2
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.fn();
    }
}
 */