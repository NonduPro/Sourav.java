/*import java.util.*;

class A 
{   
    int arr[] = new int[100]; //In java Array is declared like this 
    int n, i, max, min;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
    }

    void calculate()
    {

        for(i=0;i<n;i++)
        {
            System.out.print("\nEnter value for arr[" + i +"]: "); 
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for(i=1;i<n;i++) //Here We can also use two loops for maximum and minimum value print
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.print("\nMaximum element is: " + max);
        min = arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.print("\nMinimum element is: " + min);   
    }
}
class Main 
{
    public static void main(String[] args)
    { 
        A obj = new A();
        obj.input();
        obj.calculate();
    }
} */

import java.util.*;

class A 
{
    int arr[] = new int[100];
    int n, i, max, min;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.print("\nEnter number of elements: ");
        n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("\nEnter value for arr[" +i+ "]: ");
            arr[i] = sc.nextInt();
        }
    }
    
    
    void calculate()
    {   
        max = arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.print("\nMaximum element is: " + max);
        min = arr[0];
        for(i=1;i<n;i++)
        {   
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.print("\nMinimum element is: " + min);
    }
}
class Main
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.input();
        obj.calculate();
    }
}
    
