//Program to check for an Armstrong number through a function.
//A number is armstrong if its individual digits cube sum = number itself.
//Eg:- 407 = 4^3 + 0^3 + 7^3
package project;
import java.util.Scanner;//importing Scanner
class armstrong_function
{   //program starts here
    int num;
    public void input()//making different functions
    { 
      Scanner in =new Scanner(System.in);//declaring Scanner
      System.out.println("Enter the number :-");
      num=in.nextInt(); //Asking user for the number to be checked.
    }//function input ends here
     public void Armstrong()//function of name amstrong
    {   int w ;
        int t=num;
        int sum=0;
        while(num>0)//while loop
           {
            w=num%10;
            sum+=(w*w*w);
            num=num/10;
        }
        if (sum==t)
        System.out.println("It's an armstrong number..");
        else 
        System.out.println("It's not an armstrong number..");//if else statement
        } //function Amstrong ends here
    public static void main (String args[])//main function[program execution starts from here]
      { armstrong_function obj = new armstrong_function();//object obj created.
        obj.input();//calling functions through the object. 
        obj.Armstrong();
        }//main ends here
}//program ends here

    