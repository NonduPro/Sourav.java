import java.util.*;
class A
{
    int a,b;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("\nEnter second number: ");
        b = sc.nextInt();

        System.out.print("\nBefore swapping: " +a +" " +b);
    }
    void calculate()
    {
        int temp;//We declare 'temp' here in this function

        temp=a;
        a=b;
        b=temp;
    }
    void output()
    {

        System.out.print("\nAfter swapping: " +a +" " +b);
    }
}
class Swapping
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.input();
        obj.calculate();
        obj.output();
    }
}