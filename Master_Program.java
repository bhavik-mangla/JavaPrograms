import java.util.Scanner;
class Master_Program
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("HELLO!!! Welcome to \'Bhavik's MASTER PROGRAM\'");
           for(;;)
      {
           System.out.println("Enter your choice from 1 to 15.\n 1 -->Triangle \n 2 -->Star Triangle \n 3 -->Perfect number \n 4 -->Hypotenuse And Area \n 5 -->Inverted Triangle \n 6 -->Amstrong number \n 7 -->Autotrophic or Composite number \n 8 -->BUZZ number \n 9 -->Fibonacci series  \n 10 -->Calculator \n 11 -->ODD or EVEN number \n 12 -->Num Switching \n 13 -->Minimum of 2 Numbers \n 14 -->CREDITS \n 15 --> EXIT...\n 16 -->Minimum Of 3 numbers.."); 
           int ch= in.nextInt();
           if(ch==1)
              {System.out.println("Enter the rows number");
              int n= in.nextInt();
              for ( int i = 1; i<=n;i++)
             {
                 for (int j = 1;j<=i;j++)
               {System.out.print(j+"");                                                 
              }                                                                       
               System.out.println("");
               }
           }
           else if(ch==2)
           {    System.out.println("Enter the rows number");
             int rn= in.nextInt();
              for ( int i = 1; i<=rn;i++)
              {
               for (int j = 1;j<=i;j++)
               {
                   System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
            else if(ch==3)
          {
            System.out.println("Enter the number");
           int n= in.nextInt();
           int sum = 0;
           for ( int i = 1; i<n;i++)
           { if (n%i==0)
               sum=sum+i;
           }
           if (sum==n)
           System.out.println("Perfect number");
           else
           System.out.println("Not a Perfect number");
            }
             else if(ch==4)
          {
             System.out.println("Enter the 2 sides (in cm) other than hypotenuse to check their hypotenuse and area.");
             double x, y, z, a;
             x = in.nextInt();
             y = in.nextInt();
             z = Math.sqrt((x*x)+(y*y));
             a = 0.5 * x * y;
             System.out.println("Hypotenuse = " + z +(" cm"));
             System.out.println("Area = " + a + (" cm²"));
           
            }
             else if(ch==5)
          {
              System.out.println("Enter the rows number");
           int n= in.nextInt();
           for ( int i = n; i>=1;i--)
           {
               for (int j = 1;j<=i;j++)
               {System.out.print(i+"\t");
                }
                System.out.println("");
           }
        }
            else if(ch==6)
          {  System.out.println("Enter the number :");
              int n = in.nextInt();
              int w ;int t=n;int sum=0;
              while(n>0)
               {w=n%10;
                   sum+=(w*w*w);
                   n=n/10;
            }
                if (sum==t)
                {System.out.println("It's an armstrong number..");
                }
                else System.out.println("It's not an armstrong number..");
           
            }
             else if(ch==7)
          {   System.out.println("Enter the number :-");
        int num = in.nextInt();
        int sq = num*num;
        int counter=0;
        int t = num;
        for(int i = num;num>0;num=num/10)
        {counter++;}
        int lastdgt = sq%(int)Math.pow(10,counter);
        if(t==lastdgt)
        {System.out.println("Autotrophic number");}
        else
        {System.out.println("Composite number");}
           
            }
             else if(ch==8)
          {
           System.out.println("A buzz number should have it's last digit=7 or it should be comletely divisible by 7");
           System.out.println("ENTER THE NUMBER");
           double a = in.nextDouble();
           if ( a%10==7 || a%7==0)
           {System.out.println("It's a buzz number");}
           else {System.out.println("It's not a buzz number...");}
            }
            else if (ch==9)
        {
            System.out.println("Enter the number:");
           int n=in.nextInt();
           int n1=0;
           int n2=1;int n3;
           System.out.print(n1+" "+n2+" ");
           for(int i=1; i<=n; i++)
           {
               n3 = n2 + n1;
               System.out.print(n3+" ");
               n1=n2;
               n2=n3;
              
            }
            }
            else if(ch==10)
          { int x, y,z;
            System.out.println("Enter 1st number");
            x = in.nextInt();
               System.out.println("Enter 2nd number");
            y = in.nextInt();
               System.out.println("Enter 1 for addition.");
               System.out.println("Enter 2 for  subtraction.");
               System.out.println("Enter 3 for multiplication.");
               System.out.println("Enter 4 for division.");
               System.out.println("Enter 5 for square root of 1st number.");
               System.out.println("Enter 6 for square root of 2nd number.");
              z = in.nextInt();  
           if (z==1) {System.out.println("Result    =     "+ (x + y));}
           else if (z==2) {System.out.println("Result    =     "+ (x - y));}
           else if (z==3) {System.out.println("Result    =     "+ (x * y));}
           else if (z == 4) {System.out.println("Result    =     "+ (x / y));}
           else if (z == 5) {System.out.println("Result    =     "+ (Math.sqrt(x)));}
           else if (z == 6) {System.out.println("Result    =     "+ (Math.sqrt(y)));} 
           else if (z == 7) {System.exit(0);} 
           
            }
            else if (ch==11)
            {
                 System.out.println("HELLO! Enter the number to check whether it's odd or even");
            double a ; a= in.nextDouble();
            if (a%2==0){System.out.println("It's an EVEN number since the remainder after dividing it by 2 = 0.");} 
            else System.out.println("It's an odd number since the remainder after dividing it by 2 = 1.");
            }
            else if (ch==12)
            {
                System.out.println("Enter 1st number(x) and 2nd number(y) to switch them.");
                double x, y, z;
                System.out.println("x = ");
                x = in.nextInt();
                System.out.println("y = ");
                y = in.nextInt();
                z = x;
                x = y;
                y = z;
                System.out.println("x = " + x );
                System.out.println("y = " + y );
            }
            else if (ch==13)
            {
                 System.out.println("Enter 1st number:-");
           int x=in.nextInt();
           System.out.println("Enter 2nd number:-");
           int y=in.nextInt();
           int result= (x<y)?x:y;
           System.out.println(result+" is minimum between two given numbers");
            }
             else if(ch==14)
          {
              System.out.println("This Program is made by BHAVIK MANGLA\n Class --> 9 B\n School-->Scottish High International School");
           
            }
              else if(ch==15)
          { System.exit(0);
           
            }
            else if(ch==16)
            {
             double x,y,z,a;
            System.out.println("Enter three numbers");
             x=in.nextDouble();
             y=in.nextDouble();
              z=in.nextDouble();
               a=(x>y && x>z)? x:(y>x && y>z)?y:z;
            System.out.println(a+" is the maximum in these three numbers.");
          
         
            }

             else 
            {
                System.out.println("Please enter the correct choice in next try!!!");
                System.exit(0);
         }
    }
 
  }
}