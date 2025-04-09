import java.util.*;// VS code shows that import java.io.; not required
                    // Also we can write import java.util.Scanner; //If we need only one class
class Add
{
    int a, b, c;
    Scanner sc=new Scanner(System.in);// Using multiple function
    void input()
    {
        System.out.print("\nEnter first number: "); 
        a = sc.nextInt();
        System.out.print("\nEnter second number: ");
        b = sc.nextInt();
    }
    void calculate()
    {
        c = a + b;
    }
    void output()
    {
        System.out.print("\nSum of two numbers: "+c);
    }
}
class Addition
{
    public static void main(String[] args) 
    {
        Add obj = new Add();
        obj.input();
        obj.calculate();
        obj.output();
    }
}

/*Using single function--

import java.util.*;// VS code shows that import java.io.; not required
                   // Also we can write import java.util.Scanner; //If we need only one class
class Add
{
    int a, b, c;
    Scanner sc=new Scanner(System.in);// Using one function
    void fn()
    {
        System.out.print("\nEnter first number: ");
        a = sc.nextInt();
        System.out.print("\nEnter second number: ");
        b = sc.nextInt();
        c = a + b;
        System.out.print("\nSum of two numbers: "+c);
    }
}
class Addition
{
    public static void main(String[] args) 
    {
        Add obj = new Add();
        obj.fn();
    }
}
 */