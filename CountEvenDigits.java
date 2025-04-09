import java.util.*;

class A 
{
    int n, r, c = 0; // Added count variable  
    Scanner sc = new Scanner(System.in);

    void input() 
    {
        System.out.print("Enter the integer: ");
        n = sc.nextInt();
    }

    void calculate() 
    {
        System.out.print("Even digits are: ");
        while (n != 0) 
        {   
            r = n % 10; //or, For double integer r = n % 100;
            if (r % 2 == 0) 
            {
                System.out.print(r + " ");//For printing the even numbers side by side 
                c++; // Increment the counter
            }
            n = n / 10; 
        }
    }
    void output()
    {
        System.out.print("\nTotal Even digits Count = " +c); // Display total count 
    }
}

class CountEvenDigits
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.input();
        obj.calculate();
        obj.output();
    }
}
/*Or--

import java.util.*;

class A 
{
    int n, r, c = 0; // Added count variable  
    Scanner sc = new Scanner(System.in);

    void input() 
    {
        System.out.print("Enter the integer: ");
        n = sc.nextInt();
    }

    void calculate() 
    {
        while (n != 0) 
        {   
            r = n % 10; //or, For double integer r = n % 100;
            if (r % 2 == 0) 
            {
                System.out.print("\nEven digit = " +r);
                c++; // Increment the counter
            }
            n = n / 10; 
        }
    }
    void output()
    {
        System.out.print("\nTotal Even digits Count = " +c); // Display total count 
    }
}

class CountEvenDigits
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.input();
        obj.calculate();
        obj.output();
    }
}
 */
