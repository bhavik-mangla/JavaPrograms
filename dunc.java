
import java.util.Scanner;
import java.util.*;
import  java.lang.Math;

class Stringkkkk
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter 2 numbers");
           int n1=in.nextInt();
            int n2=in.nextInt();
            System.out.println("Enter n");
            int n=in.nextInt();
            int n3=0;
            if (n==2){
                n3 = n1+n2;
            }
            else{
            
            }
            
            
            for ( int i = 0; i<5;i++) 
           {
               
                String[] split = s[i].split(" ");
                    
                n[i]=split;
                
            }
            int b=0;
            int a=0;
            
             for ( int i = 0; i<5;i++) {
                  for ( int j = 0; j<5;j++) {
               if (n[i][j].equals("1")){
                   
                   a=i;
                   b=j;
                   
                   break;
                }
                
            
            }
            }
            a+=1;
            b+=1;
            
            int summ1 = Math.abs(a-3)+Math.abs(b-3);
            System.out.println(summ1);
            
            }
                
            
            }
            
