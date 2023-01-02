import java.util.*;
class Series
{
    double sum=0.0;
    int x,n;
    void input()
    {
          Scanner in =new Scanner(System.in);
          System.out.println("Enter x :-");
          x= in.nextInt(); 
          System.out.println("Enter n :-");
          n=in.nextInt(); 
    }
    void sumSeries()
    {
               for (int i= 4,b=1;b<=n;b++,i+=4)
               {
                   sum+=(double)x/i;
            }
        } 
    void display()
        {
            System.out.println("Sum of the series : "+sum);
        }
    public static void main (String args[])
      { 
         Series obj = new Series();
        obj.input();
        obj.sumSeries();
        obj.display();
        }
    }
