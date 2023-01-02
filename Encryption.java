import java.util.*;
 class Encryption
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        if(n<1&&n>10)
        System.exit(0);
        String s[] = new String[n];
        System.out.println("Enter Strings:-");
        in.nextLine();
        int asc1;
          char ch1;
        int count =0;
                for(int i=0;i<n;i++)
        {
           s[i]=in.nextLine();s[i]=s[i].replace(".","");
        }
        String  word=""; boolean flag= false;    
        for(int i=0;i<n;i++)
        {if((i%2)!=0)
            {String input = s[i];
             String output = "";
             String[] array = input.split(" ");
             for( int k = array.length-1; k >= 0; k--)
             {
                 output += array[k];
                 if (k != 0) { output += " "; }  
             }
             System.out.println(output+".");
                 }
                 else{
          for(int j=0;j<s[i].length();j++)
        {   char ch=s[i].charAt(j);
            if (ch != ' ')
              {  asc1=ch;
                  if(asc1!=90&&asc1!=89){
                  asc1+=2;
                  ch1=(char)asc1;
                  System.out.print(ch1);
                }else if (asc1==89)
               {ch1='A';
                System.out.print(ch1);
                  }
                  else
               {ch1='B';
                System.out.print(ch1);
                  }
                asc1=0;
                ch1=0;
                }
                else System.out.print(" ");
                }
                System.out.println(".");
       }
    }
}
}

