import java.util.*;
class A
{
    int line, i, j, k;
    Scanner sc = new Scanner(System.in); 

    A() //***Cheating , // All codes are need to pe placed into default constructor
    {
        input();
        output();
    }

    void input()
    {
        System.out.print("Enter the number of lines: "); //Using default constructor and functions 
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
                System.out.print("* "); 
            }
            System.out.print("\n");
        }
    }

    void output()
    {
        calculate();
    }
}

class DefaultConstructor
{
    public static void main(String[] args) 
    {
         A obj = new A();
    }
} 


/* Using Only default constructor--

import java.util.*;
class A
{
 		int line,i,j,k;
		Scanner sc=new Scanner(System.in);

		A() //Correct version
		{
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
class DefaultConstructor
{
	public static void main(String[] args) 
	{
		A obj=new A();
	
	}
}
 */