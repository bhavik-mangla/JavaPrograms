import java.util.Scanner;
class StringShift
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a string.");
          String s=in.nextLine();
          s=s +" ";int count = 0;int asc1;
          s=s.replace(".","");
          char ch1;
           for (int i=0,n1=0;i<s.length();i++)
        {
              char ch= s.charAt(i);
              if (ch != ' ')
              {  asc1=ch;
                  if(asc1!=90){
                  asc1+=1;
                  ch1=(char)asc1;
                  System.out.print(ch1);
                }else 
               {ch1='A';
                System.out.print(ch1);
                  }
                asc1=0;
                ch1=0;
                }
                
             else {System.out.print(" ");
            }  
          
        
        } 
    }
}         
        
    