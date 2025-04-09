import java.util.*;

class A 
{
    int n, i;
    Scanner sc = new Scanner(System.in);

    void input() 
    {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }

    void calculate() 
    {
        System.out.print("Factors of the number are: ");
        for (i = 1; i <= n; i++) 
        {
            if (n % i == 0) 
            {
                System.out.print(i + " ");//For printing the factors side by side
            }
        }
        System.out.println(); // Move to the next line after printing all factors(It does not necessary, just for show)
    }
}

class FactorsofaNumber
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}

/*Or--
 
import java.util.*;

class A
{
    int n,i;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }
    void calculate()
    {
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print("\nThe factor of the number is: " +i);
            }
        }
    }

}

class FactorsofaNumber
{
    public static void main(String[] args)    
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}
 */
