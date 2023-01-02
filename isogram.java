import java.util.Scanner;
class isogram
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
          String s=in.nextLine();
          s=s+" ";
          s=s.replace(".","");
         String  word="";
         int count=0; boolean flag=true;
          for (int i=0;i<s.length();i++)
           {
              char ch= s.charAt(i);
              if (ch != ' ')
               word = word +ch;
               else
               { outer:for (int j=0;j<word.length()-1;j++)
                {  int ch1 = (int)word.charAt(j);
                   for(int k=j+1;k<word.length();k++)
                    {
                    int ch2 = (int)word.charAt(k);
                    
                    if(ch1==ch2){
                       
                        flag=false;
                        break outer;
                        }
                    }}
                 if(flag==true)
                  System.out.println(word+" ");
                  flag=true;
                word="";
             }
            }
            
        }
    }
    