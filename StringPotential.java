import java.util.Scanner;
import java.util.*;
class StringPotential
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence in upper case.");
          String s=in.nextLine();
          s=s +" ";int count = 0;int asc=0;
          s=s.toUpperCase();
          s=s.replace(".","");int n=0;
        String  word=""; boolean flag= false;              
        for(int i=0;i<s.length();i++)
        {   char ch=s.charAt(i);
            if (ch !=' ')
            word=word+ch;
            else 
            {count+=1;
                word="";}
            }
        count=n;
        String arr[] = new String[n];
        int ar[]=new int [n];int min=0;
           for (int i=0,n1=0;i<s.length();i++)
        {
              char ch1= s.charAt(i);
              if (ch1 != ' ')
              { asc+=ch1-64;
                  word =word+ ch1; 
                }else 
               {
                  arr[n1]= word;
                  ar[n1]=asc;
                  asc=0;
                  word="";n1++;
                  }
        }  
                for( int i=0;i<n-1;i++)//5 3 4 1 2
         {
             min=i;
             for(int j=i+1;j<n;j++)// 
             { if (ar[j]<ar[min])
                 min=j;}
            int t  = ar[i];
            ar[i]=ar[min];
            ar[min]=t;
            String t1  = arr[i];
            arr[i]=arr[min];
            arr[min]=t1;
        } 
         System.out.println ("OUTPUT : " );
         for (int i = 0 ; i < n ; i ++) {
             System.out.print (arr[i]+" ");
            }
        } 
            
            }
        
    