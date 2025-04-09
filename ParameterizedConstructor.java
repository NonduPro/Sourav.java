import java.util.*;
class A
{
    int line, i, j, k;// Correct version

    A(int line) //A(int A) , //Using only Parameterized Constructor 
    {
        //line = A;
        for(i = 1; i <= line; i++)
        {
            for(k = i; k < line; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }  
}

class ParameterizedConstructor
{
    public static void main(String[] args) 
    {
        int line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        line = sc.nextInt();
        A obj = new A(line); // Passing user input to the parameterized constructor
        sc.close(); // To close the scanner from leaking resources   
    }
}


/*Using Parameterized Constructor and functions 

import java.util.*;
class A
{
    int line, i, j, k;
    Scanner sc = new Scanner(System.in);

    A(int A) // Parameterized constructor //Here we can also use B as a variable then we delare line = B;
    {
        line = A; // Assigning the parameter to the instance variable without using 'this'
        output();
    }

    void calculate()//***Cheating , // All codes are need to pe placed into parameterized constructor
    {
        for(i = 1; i <= line; i++)
        {
            for(k = i; k < line; k++)
            {
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    void output()
    {
      calculate();
    }
}

class ParameterizedConstructor
{
    public static void main(String[] args) 
    {
        int line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        line = sc.nextInt();
        A obj = new A(line); // Passing user input to the parameterized constructor
    }
}
 */
