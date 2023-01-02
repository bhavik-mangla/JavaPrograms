import java.util.Scanner;
class pattern2018
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter the String");
           String s = in.nextLine();
           int n = s.length();
           System.out.println("Enter 1 or 2 ");
           int n1= in.nextInt();
           if (n1==1){
           for ( int i =1; i<=s.length();i++)
           {
               System.out.print(s.substring(0,n));
               System.out.println("");
               n--;
       }}
       else if (n1==2) {
       for ( int i =0; i<s.length();i++)
          {
               for ( int j =0; j<=i;j++)
        {
               System.out.print(s.charAt(i));
           }
            System.out.println("");
        }}
        else System.out.println("Invalid Selection");
        }
}
