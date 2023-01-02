import java.io.*;
public class spy {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a numbers to check whether it is a spy number or not." );
        int n = Integer.parseInt(br.readLine());
        boolean flag=false;
        int s=n;int sum=0,pro=1;
    while(s>0)
    {   n=s%10;
        sum+=n;
        pro*=n;
        s/=10;
    }
    System.out.println("Sum = " +sum+ "\nProduct = "+pro);
    if (sum==pro)
    System.out.println("The number is a spy number.");
  }
}
