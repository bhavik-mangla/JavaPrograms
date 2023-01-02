
import java.io.*;
public class Chance_Game_MULTYPLAYER
{
        public static void main(String args[])throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        
        System.out.println("-------Welcome to The Bhavik's Chance Game-------");
        System.out.println("         ---------- Main menu ---------- ");
        System.out.println(" ");
        System.out.println(" 1. Play ");
        System.out.println(" 2. Help ");
        System.out.println(" 3. Others ");
        System.out.println("");
        System.out.println("Enter Your Choise....");
        int ch = Integer.parseInt(br.readLine());
        System.out.println(" ");
        
        System.out.println("=========================================================================================================================================");
        System.out.println(" ");
        System.out.println(" ");
        
        
        if (ch==1)
           {
            int r;
        int c1=0;
        int c2=0;
        for(i=1;i<=10;i++)
        {
            r= 1+(int)(Math.random()*5);
           
            if(i % 2 == 1)
            {
                
                System.out.println(" _________PLAYER 1's turn_________ !! - Enter any number... ");
                System.out.println("");
                
                
                int no = Integer.parseInt(br.readLine());
                
                if (no==r)
                {
                    System.out.println(" you got your luck !!! +1* ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                       ***                     ");
                    c1=c1+1;
                }
                else
                {
                    System.out.println(" Sorry.....it was '"+r+"' better luck next time ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                       ***                     ");
                }
                
                
            }
            
            else 
            {
                System.out.println(" _________PLAYER 2's turn_________ - Enter any number...");
                System.out.println("");
                
                int no = Integer.parseInt(br.readLine());
                
                if (no==r)
                {
                    System.out.println(" you got your luck !!! +1*  ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                       ***                     ");
                    c2=c2+1;
                }
                else
                {
                    System.out.println(" Sorry.....it was '"+r+"' better luck next time ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                       ***                     ");

                }
                
                
            }
            
            
        }
        
        System.out.println(" GAME OVER !!! ");
        
        if ( c1 > c2)
        {
            System.out.println(" The Winner is --- PLAYER 1 !!! ");
            System.out.println(" ");
            System.out.println("=========================================================================================================================================");
        }
        else if (c2 > c1)
        {
            System.out.println(" The Winner is --- PLAYER 2 !!!");
            System.out.println(" ");
            System.out.println("=========================================================================================================================================");
        }
        else
        {
            System.out.println("draw match");
            System.out.println(" ");
            System.out.println("=========================================================================================================================================");
        }
        
            
         
        
        
            }
            
        else if (ch==2)
        {
            System.out.println(" This is a multyplayer game in which 2 player can play at the same time... ");
            System.out.println(" Enter a number which you guess if the number matches with the computer generated random number then +1 else 0");
            System.out.println(" Just Enter a number and Press Enter !!");
            System.out.println(" The turn is alternate !!");
            System.out.println(" Enjoy !!!");
        }
        
        else if (ch==3)
        {
             System.out.println("Credits -- ");
             System.out.println("   This Game is developed by Bhavik Mangla ; U can also find me at youtube- BHAVIX ");
             System.out.println("   This Game uses Buffered reader and is made for Absolute beginners so that they can understand...");
             System.out.println("   Please do not distribute this SourceCode without my details in the Credits...");
             System.out.println("   Thanks for hopping by..... Enjoy !!!");
             System.out.println("   Updated versions coming soon... to stay updated 'Subscribe'");
        }
        else
        {
            System.out.println("oops.. Wrong Input ! Please try Again.. ");
            
            
            
            
            
        }
        
     }
}

