import java.io.*;
public class goldBACH
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a numbers to check whether it is goldbach." );
        int n = Integer.parseInt(br.readLine());
        int n2=n;
        boolean flag=true;
        if(n2>=0 && n2%2==0)
        {outer:for(int i =3;i<=n;i++)
        {
           inner: for(int j=3;j<=n;j++)
            {
           for ( int x = 2; x<i;x++)
           { if (i%x==0)
               {flag=false;
               continue outer; 
            }
             else flag= true;
           }
           for ( int y = 2; y<j;y++)
           { if (j%y==0)
               {flag=false; 
               continue inner; 
            }
             else flag= true;
           }
           
           
           if((i+j)==n && flag == true)
             {System.out.println("It's a goldbach number");
                System.out.println("The numbers are :- "+i +","+j);
                 break outer;
        }
    }
}
}

    else {
        System.out.println("Enter a +ve integer number");
        System.exit(0);
}
if (flag==false)
System.out.println("It's not an goldbach number");
}
}