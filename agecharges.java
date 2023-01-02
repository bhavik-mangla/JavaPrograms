import java.util.Scanner;
class agecharges
{ public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        int age;
        System.out.println("WELCOME to Delhi metro station....");
        System.out.println("Enter your age");
        age = in.nextInt();
        if (age>=18){System.out.println("Your charge = Rs.30");}
        else if (age<18&&age>5){System.out.println("Your charge = Rs.16");} 
        else if(age<=5&& age >= 0){System.out.println("No charge");}
        else {System.out.println("Enter a valid number");} 
    }
}
