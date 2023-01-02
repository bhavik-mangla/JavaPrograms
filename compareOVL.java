import java.util.*;

public class compareOVL

 {   double sum=0.0;
    int x,n;
   
    void compare(int x,int y)
    {
     System.out.println("Greater of TWO :- " + "\n"+(x>y?("x: "+x):("y: "+y)));
        } 
         void compare(char a,char b)
    {
        int x = (int)a;
        int y = (int)b;
     System.out.println("Greater of TWO :- " + "\n"+(x>y?("a: "+x):("b: "+y)));
    }
}
