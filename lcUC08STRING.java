import java.util.Scanner;
class lcUC08STRING
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a string.");
          String s=in.nextLine();
          int count1=0,count2=0,count3=0,count4=0,count5=0;
          int ch=0;
           for (int i=0,n1=0;i<s.length();i++)
        {     char ch1= s.charAt(i);
            ch=(int)ch1;
              if (ch >=65 && ch<=90 )
              {  count1+=1;
                }
                else if (ch>=97 && ch<=122)
               {count2+=1;
                  }
                else if (ch>=48 && ch<=57)
                {count3+=1;
                }
                
             else if(ch1==' ')
             {count4+=1;
            }  
            else 
            count5+=1;
        }
        System.out.println("Uppercase Characters = "+ count1);
        System.out.println("Lowercase Characters = "+ count2);
        System.out.println("Digits = "+ count3);
        System.out.println("Number of spaces = "+ count4);
        System.out.println("Special Characters = "+ count5);
    }
}