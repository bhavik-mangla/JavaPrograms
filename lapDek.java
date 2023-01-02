import java.util.Scanner;
class lapDek
    {  public static void main (String args[])
          {  Scanner in= new Scanner (System.in);
             double aop,d1,d2,d3,d4,d5,na;
             String name,add,top;
             System.out.println("Enter your name :-");
             name= in.nextLine();
             System.out.println("Enter your address :-");
             add= in.nextLine();
             System.out.println("Enter type of purchase(L for laptop and D for dekstop) :-");
             top= in.nextLine();
             System.out.println("Enter amount of purchase :-");
             aop= in.nextDouble();
             d1=aop-((5.0/100)*aop);
             d2=aop-((7.5/100)*aop);
             d3=aop-((7.6/100)*aop);
             d4=aop-((10.0/100)*aop);
             d5=aop-((15.0/100)*aop);
             if (aop >=0 && aop <=25000 && top.equals("L")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ aop);}
             else if (aop >=25001 && aop <=57000 && top.equals("L")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ d1);}
             else if (aop >=57001 && aop <=100000 && top.equals("L")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ d2);}
             else if (aop >100000 && top.equals("L")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ d4);}
             else if (aop >=0 && aop <=25000 && top.equals("D")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ d1);}
             else if (aop >=25001 && aop <=57000 && top.equals("D")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ d3);}
             else if (aop >=57001 && aop <=100000 && top.equals("D")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ d4);}
             else if (aop >100000 && top.equals("D")){System.out.println ("Name = " + name);
             System.out.println ("Address = " + add);System.out.println("Net amount = "+ d5);}
            }
        }
