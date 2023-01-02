import java.util.*;
public class StringFunctions
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        for (;;){
        System.out.println("1.Char charAt (int n)");
        System.out.println("2.int compareTo(String1, String2)");
        System.out.println("3.String concat(String str)");
        System.out.println("4.boolean endsWith(String str)");
        System.out.println("5.boolean equals(String str)");
        System.out.println("6.boolean equalsIgnoreCase(String str)");
        System.out.println("7.int indexOf(char ch)");
        System.out.println("8.int lastIndexOf(char ch)");
        System.out.println("9.int length( )");
        System.out.println("10.String replace (char oldChar,char newChar)");
        System.out.println("11.boolean startsWith(String str)");
        System.out.println("12.String substring(int beginIndex, int endIndex)");
        System.out.println("13.String toLowerCase( )");
        System.out.println("14.String toUpperCase( )");
        System.out.println("15.String trim( )");
        System.out.println("16.String valueOf(all types)");
        System.out.println("17. EXIT...");
        System.out.println("Enter your chice from 1 to 17.");
        int n=in.nextInt();String s,s1,s2;char ch;int nm,nm1;boolean b;
        switch(n)
        {
          case 1: {System.out.println("Enter a string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   ch=s.charAt(2);
                   System.out.println("ch=s.charAt(2)="+ch);break;
            }
            case 2: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter 2nd string:");
                   s1=in.nextLine();
                   nm= s.compareTo(s1);
                   nm1= s1.compareTo(s);
                   System.out.println("nm= s.compareTo(s1)=;"+nm);
                   System.out.println("nm1= s1.compareTo(s)=;"+nm1);
                   break;
            }
            case 3: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter 2nd string:");
                   s1=in.nextLine();
                   System.out.println("s.concat(s1)= " +s.concat(s1));break;
            }
            case 4: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter string to be searched in 1st.");
                   s1=in.nextLine();
                   b = s.endsWith(s1);
                   System.out.println(" boolean b = s.endsWith(s1); =="+b);break;
            }
            case 5: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter 2nd string:");
                   s1=in.nextLine();
                   b=s.equals(s1);
                   System.out.println("b=s.equals(s1); == "+ b);break;
            }
            case 6: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter 2nd string:");
                   s1=in.nextLine();
                   b=s.equalsIgnoreCase(s1);
                   System.out.println("b=s.equalsIgnoreCase(s1); == "+ b);break;
            }
            case 7: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter the character.");
                   ch = in.next().charAt(0);
                   System.out.println("s.indexOf(ch)== "+s.indexOf(ch));break;
            }
            case 8: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter the character.");
                   ch = in.next().charAt(0);
                   System.out.println("s.lastIndexOf(ch)== "+s.lastIndexOf(ch));break;
            }
            case 10: {
                   System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter character to be replaced.");
                   ch = in.next().charAt(0);
                   System.out.println("Enter character to repace with it.");
                   char ch1 = in.next().charAt(0);
                   System.out.println("s.replace(ch,ch1)== "+s.replace(ch,ch1));break;
            }
            case 9: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   int length = s.length();
                   System.out.println("int length = s.length();== "+ length);break;
            }
            case 11: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter string to be searched in 1st.");
                   s1=in.nextLine();
                   b = s.startsWith(s1);
                   System.out.println(" boolean b = s.startsWith(s1); =="+b);break;
            }
            case 12: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   System.out.println("Enter the starting index :");
                   nm = in.nextInt();
                   System.out.println("Enter the ending index :");
                   nm1 = in.nextInt();
                   s1=s.substring(nm,nm1);
                   System.out.println("s1=s.substring(nm,nm1);== " + s1);break;
            }
            case 13: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   s1=s.toLowerCase();
                   System.out.println("s1=s.toLowerCase();== " + s1);break;
            }
            case 14: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   s1=s.toUpperCase();
                   System.out.println("s1=s.toUpperCase();== " + s1);break;
            }
            case 15: {System.out.println("Enter 1st string:");
                   s2=in.nextLine();
                   s=in.nextLine();
                   s1=s.trim();
                   System.out.println("s1=s.trim();== " + "("+s1+")");break;
            }
            case 16: {System.out.println("Enter a number:");
                   nm=in.nextInt();
                   s1=String.valueOf(nm);
                   System.out.println("s1=String.valueOf(nm);== " + s1);
                   s2=s1+5;
                   System.out.println("s2=s1+5 ===" + s2);
                   break;
            }
            case 17 :System.exit(0);break;
            default :{  System.out.println("Please enter correct choice!!!");
                        System.out.println("");System.out.println("");
                        break;
                     }
        }
    }
}
}