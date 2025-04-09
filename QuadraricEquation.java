import java.util.*; //Sir said import java.lang.*; required
class A
{
    double r1, r2, a, b, c, d; 
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.print("\nEnter the value of b: ");
        b = sc.nextDouble();
        System.out.print("\nEnter the value of c: ");
        c = sc.nextDouble();
    }
    void calculate()
    {
        d = (b*b) - (4*a*c);

        if(d==0)
        {
            System.out.print("\nRoots are real and equal");
            r1=r2= -b/(2*a); //Sir said only r1 = -b/(2*a);
            System.out.print("\nR1= " + r1);
            System.out.print("\nR2= " + r2); 
        }
        else if(d > 0) 
        {
            System.out.print("\nRoots are real and distinct.");
            r1 = (-b + Math.sqrt(d)) / (2*a);
            r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.print("\nR1= " + r1);
            System.out.print("\nR2= " + r2);
        }
        else
        {
            System.out.print("\nRoots are distinct and imaginary.");      
        }
    }
}

class QuadraricEquation
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}
