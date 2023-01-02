import java.io.*;
public class pronic {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a numbers to check whether it is pronic." );
        int n = Integer.parseInt(br.readLine());boolean flag=false;
    for (int i =1;i<n;i++)
    {if (n%i==0 && n%(i+1)==0)
        {System.out.println("The number is a pronic number.");
            flag=true;
        break;}
    }
    if (flag==false)
    System.out.println("The number is not a pronic number.");
  }
}
