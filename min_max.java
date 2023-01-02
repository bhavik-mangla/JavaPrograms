import java.util.Scanner;
class min_max
{public static void main(String  args[])
{Scanner in=new Scanner(System.in);
 double x,y,z,a;
 System.out.println("Enter three numbers");
 x=in.nextDouble();
  y=in.nextDouble();
   z=in.nextDouble();
   a=(x>y && x>z)? x:(y>x && y>z)?y:z;
   System.out.println(a+" is the maximum in these three numbers.");
}
}