import java.util.*;// VS code shows that import java.io.; not required
                  // Also we can write import java.util.Scanner; //If we need only one class

class New
{
    int line, i, j, p; 
    Scanner sc = new Scanner(System.in);// Using single function
    void fn() 
    {
        System.out.print("\nEnter number of lines: ");
        line = sc.nextInt();
 
        for(i=1;i<=line;i++)
        {
            p=i;
           for(j=1;j<=i;j++)
           {
                System.out.print(p+" ");  
                p++;
           }
           System.out.print("\n");
        }
    }

}

class Firstseries
{
    public static void main(String[] args) 
    {
        New obj = new New();
        obj.fn();              
    }
}