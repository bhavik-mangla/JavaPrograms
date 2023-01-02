import java.util.Scanner;
class DigitFrequency
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter integer");
           String n=in.nextLine();
           int count =0;
           for(int i=0;i<10;i++){
           for(int j=0;j<n.length();j++)
           
               
           {char ch = n.charAt(j);
            int d = ((int)ch)-48;
               if(i==d)
               count++;
               
         }
         if(count>0)System.out.println(i+"\t"+count);count=0;
        }
    }
}
    