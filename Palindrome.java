import java.util.*;
class A
{
    int n, s=0, r, m;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }
    void calculate()
    {
        m=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
    }
    void output()
    {
        if(m==s)
        {
            System.out.print("The number" + " " + m +" "+ "is a palindrome.");
        }
        else
        {
            System.out.print("The number" + " " + m +" "+ "is not a palindrome.");
        }
    }

}

class Palindrome
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.input();
        obj.calculate();
        obj.output();
    }
}