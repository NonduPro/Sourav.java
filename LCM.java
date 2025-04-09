
import java.util.*;// It contains LCM and HCF of two numbers

class A
{
   int a, b, lcm, m, n, r;// Here a= HCF
   Scanner sc= new Scanner(System.in);

   void input()//Using multiple function
   {  
      System.out.print("Enter First Number: ");
      a = sc.nextInt();
      System.out.print("Enter Second Number: ");   
      b = sc.nextInt();
   

   }
   void calculate()
   {

      m = a;
      n = b;

      while(b != 0)
      {
        r=a%b;
        a=b;// a is hcf
        b=r;
      }
      lcm = (m*n)/a;

   }
   void output()
   {
      System.out.println("HCF of input numbers: "+a);
      System.out.println("LCM of input numbers: "+lcm);
   }
}
class LCM
{
   public static void main(String[] args)
   {
      A obj = new A();
      obj.input();
      obj.calculate();
      obj.output();
      
   }
}