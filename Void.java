import java.util.*;
class A
{     
    int a, b,c;
    A(int a , int b)
    { 
        c=a+b;
    }
    A(A ob)
    {
        a=ob.a;
        b=ob.b;
        c=ob.c;
    }
    void display()
    {
        System.out.print("\nSum=" +c);
    }
     
}
class Void
{
    public static void main(String[] args) 
    {   
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("\nEnter second number: ");
        b = sc.nextInt();
        A obj1 = new A(a, b);
        obj1.display();

        A obj2 = new A(obj1);
        obj2.display();
    }
}