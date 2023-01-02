import java.util.Scanner;
public class polygon

 {
    int x;
   char h;
   int y;
    void design(int x,char h)
    {
      for ( int i = 1; i<=x; i++ )
           {
               for (int j =1 ;j<=x;j++)
               {System.out.print(h+"\t");}
               System.out.println("");
           } 
        } 
         void design(int x,int y)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the character to be printed...");
        h = in.next().charAt(0);
    for ( int i = 1; i<=x; i++ )
           {
               for (int j =1 ;j<=y;j++)
               {System.out.print(h+"\t");}
               System.out.println("");
           } 
        }
}
