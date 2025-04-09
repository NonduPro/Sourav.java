import java.util.*;

class A
{
    int a,b;
    Scanner sc= new Scanner(System.in);  
}
class B extends A //Sum & difference between two numbers Using Inheritence[*Hybrid Inheritence---(Combination of single & hierarchical inheritence)]
{
    void input()
    {
        System.out.print("\nEnter first number: ");  
        a=sc.nextInt();

        System.out.print("\nEnter second number: ");  
        b=sc.nextInt();

    }
}
class C extends B
{
    int c;
    void calculation()
    {
        c=a+b;
        System.out.println("\nSum of two numbers: "+c);
    }
} 
class D extends B
{
    int d;
    void calculation()
    {
        d=a-b;
        System.out.println("\nDifference of two numbers: "+d); 
    }
}
class HybridInheritence 
{
    public static void main(String[] args) 
    {
        C obj1 = new C();
        obj1.input();
        obj1.calculation();
        D obj2 = new D();
        obj2.input();
        obj2.calculation();

    }
}
