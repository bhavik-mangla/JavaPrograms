import java.util.Scanner;
class StringShift2
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a string.");
          String s=in.nextLine();
          s=s.trim();;int count = 0;int asc1;
          s=s.replace(".","");
           for (int i=0,n1=0;i<s.length();i++)
        {
              char ch= s.charAt(i);
              int n= s.indexOf(ch);
              if ((n+1)%2==0)
              {int a = (int)ch;
                 a= a-1;
                char ch1=(char)a;
                System.out.print(ch1);
            }  
          else {int a = (int)ch;
                 a= a+1;
                char ch1=(char)a;
                System.out.print(ch1);
        
        } 
    }
}         
        }
    