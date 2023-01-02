/*
Question:Write a program to check whether a number is ISBN or not.
An ISBN (International Standard Book Number) is a ten digit code which uniquely identifies a book.
The first nine digits represent the Group, Publisher and Title of the book and the last digit is used to check whether ISBN is correct or not.
Each of the first nine digits of the code can take a value between 0 and 9. 
Sometimes it is necessary to make the last digit equal to ten; this is done by writing the last digit of the code as X.
To verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third and so on until we add 1 time the last digit. 
If the final sum leaves no remainder when divided by 11, the code is a valid ISBN.
Eg:- 0201103311 = 10*0 + 9*2 + 8*0 + 7*1 + 6*1 + 5*0 + 4*3 + 3*3 + 2*1 + 1*1 = 55
Since 55 leaves no remainder when divided by 11, hence it is a valid ISBN.
 */
package project;
import java.io.*;
class ISBN
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a 10 digit code : ");
String s=br.readLine();
int len=s.length();
if(len!=10)//checking whether it's an 10 digit number or not
{System.out.println("Output : Invalid Input");
System.exit(0);}
else//if it's a 10 digit number then it checks further for ISBN...
{char ch;
int dig=0, sum=0, k=10;
for(int i=0; i<len; i++)//for loop for calculating sum
{ch=s.charAt(i);
if(ch=='X'||ch=='x')
    dig=10;//if the digit is X,it calculates it as 10.
else
    dig=ch-48;//else it decreases 48 from its ascii value to get the written digit
sum=sum+dig*k;//calculating desired dum
k--;
}
System.out.println("Output : Sum = "+sum);
if(sum%11==0)//checking whether it's sum is divisible by 11 or not and printing its validity.
System.out.println("Leaves No Remainder - Valid ISBN Code");
else
System.out.println("Leaves Remainder - Invalid ISBN Code");
}
}//end of main()
}//end of class   
/*                                  VARIABLE DESCRIPTION TABLE
 *          NAME                             DATA TYPE                            DESCRIPTION
 *          s                                 String                    For taking the value from the user(!0 digit number)
 *          len                                int                      to store the length of the number
 *          ch                                 char                     to get the character at index i of the String s.
 *          dig                                int                      to get the digit at the index i from ch's ascii value.                   
 *          k                                  int                      to find the required sum.
 *          sum                                int                      to calculate the required sum to check for an ISBN number.
 *          i                                  int                      counter variable of for loop
*/