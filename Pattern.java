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
            for(k=i;k<line;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");//After the star a blank space is used  
            }
            System.out.print("\n");
        }
    }
    
    void output()
    {
        calculate();
    }
}

class Pattern
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.input();
        obj.output();
    }
}

/*Using single function--

import java.util.*; 
class A
{
	void fn()
	{
		int line,i,j,k;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the numebr of lines: ");
		line=sc.nextInt();

		for(i=1;i<=line;i++)
		{
			for(k=i;k<line;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
class Pattern
{
	public static void main(String[] args) 
	{
		A obj=new A();
		obj.fn();
	}
} */

