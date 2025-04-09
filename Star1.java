import java.util.*;

class A 
{
    int line, i, j, k;
    Scanner sc = new Scanner(System.in);
    void input()
    {    
        System.out.print("Enter the number of lines: ");
        line = sc.nextInt();
    }
    void calculate()
    {
        for(i=1;i<=line;i++)
        {   

            for(j=line;j>=i;j--)
            {
                System.out.print("* ");
                
            }
            System.out.print("\n");
            
        }
    }
}
class Star1
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}