import java.util.*;

interface A
{
    public void input();
}
interface B
{
    public void calculate();
}
class C implements A,B
{
    int n, i, f=1;
    Scanner sc = new Scanner(System.in);

    public void input()
    {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }
    public void calculate()
    {
        for(i=n;i>=1;i--)
        {
            f=f*i;
        }
    }
    void output()
    {
        System.out.print("\nFactorial of "+n+" is: "+f);
    }
}
class MultipleInheritence
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.input();
        obj.calculate();
        obj.output();
    }
}

/*OR--(Sir version)


import java.util.*;

interface A
{
    public void calculate(int p); // We can also write int n
}
interface B
{
    public void output();
}
class C implements A,B
{
    int i, f=1;
    Scanner sc = new Scanner(System.in);

    public void calculate(int p)
    {
        for(i=p;i>=1;i--)
        {
            f=f*i;
        }
    }
    public void output()
    {
        System.out.print("\nFactorial: "+f); 
    }
}
class MultipleInheritence
{
    public static void main(String[] args)
    {   
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        C obj = new C();
        obj.calculate(n);
        obj.output();
    }
}

 */