import java.util.*;
public class BinaryConvert

{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice:\n1.Binary to Decimal\n2.Decimal to Binary");
        int x = scan.nextInt();
        switch(x)
        {
            case 2: System.out.println("Enter decimal");
            int n = scan.nextInt();
            int tmp=n;
            StringBuffer s= new StringBuffer("");
            int r=0;
            
            while(n>0)
            {
                r=n%2;
                
                s=s.append(r);
                n=n/2;
            }
           s.reverse();
           System.out.println(s);
           break;
           case 1: System.out.println("Enter binary");
            int num = scan.nextInt();String s3=String.valueOf(num);
            StringBuffer s1= new StringBuffer(s3);
            int sum=0;
            s1.reverse();
            String s2 = s1.toString();
           
            for(int i=0;i<s2.length();i++)
            {
                char ch = s2.charAt(i);
                int d = (int)ch-48;
                double prod = Math.pow(2,i)*d;
                
                sum+=prod;
                
            }
            System.out.println(sum);
            break;
            default: System.out.println("invalid choice");
        }
    }
}