import java.util.Scanner;
public class f {
   static int gcd(int a, int b)
    {
        int max=0, hcf=0;
        if (a>b)
           {max=a;}
                else max = b; 
        for (int i =1;i<=max;i++)
      {if (a%i==0&& b%i==0)
        hcf = i;}
      return hcf;
    }
   static int lcm(int a, int b)
    {
        int max=0,lcm=0;
          for (int i =max;;i++)
       {if (i%a==0&& i%b==0)
        {lcm = i;break;
       }
        
    }
    return lcm;
    }
    
    static boolean relation(int a, int b)
    {
        int hcf = f.gcd(a,b);
        int lcm =f.lcm(a,b);
        int product = hcf*lcm;
        boolean relation =false;
        if(product==a*b)
    {
        relation = true;
        
    }
    return relation;
  }
  public static void main(String args [])
  {
      
        Scanner in = new Scanner (System.in);
        System.out.println("Enter two numbers" );
        int n= in.nextInt();
        int n2 = in.nextInt();
        boolean flag = f.relation(n,n2);
        System.out.println(flag);
    }
}


