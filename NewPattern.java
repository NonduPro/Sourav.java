import java.util.*;

class A 
{
    int line,p,i,j;
    Scanner sc = new Scanner(System.in);
    void fn()
    {
        System.out.print("Enter Number of lines: "); 
        line = sc.nextInt();

        for ( i = 1; i <= line; i++) 
        {
            p = 1;

            // Printing spaces
            for (j = i; j < line; j++) 
            {
                System.out.print(" ");
            }

            // Printing increasing numbers
            for (j = 1; j <= i; j++) 
            {
                System.out.print(p + " ");
                p++;
            }

            p = p - 2; // Decrease the number for decreasing part   

            // Printing decreasing numbers
            for (j = 1; j < i; j++) 
            {
                System.out.print(p + " ");
                p--;
            }

            System.out.print("\n"); //or System.out.println();  
        }
    }
}
class NewPattern
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.fn();
    }
}
/*Or other method(Sir without space between digits):-

import java.util.*;

class A 
{
    int line,i,j,k,l;
    Scanner sc = new Scanner(System.in);

    void fn()
    {
        System.out.print("Enter Number of lines: "); 
        line = sc.nextInt();

        for ( i = 1; i <= line; i++) 
        {

            // Printing spaces
            for (k = i; k < line; k++)  
            {
                System.out.print(" ");
            }

            // Printing increasing numbers
            for (j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }  

            // Printing decreasing numbers
            for (l =i - 1; l >= 1; l--) 
            {
                System.out.print(l);
            }

            System.out.print("\n"); //or System.out.println();  
        }
    }
}
class NewPattern
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.fn();
    }
}
 */







    












