import java.util.*;
class Q7_2018
 {
     static double V=0;
     double volume(double R)
     {
      V=4/3*22/7*R;
      return V;
    }
     double volume(double H,double R)
     {
     V=H*22/7*R*R;
      return V;
    }
     double volume(double L,double B,double H)
     {
      V=L*B*H;
      return V;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for volume of sphere. \n   2 for volume of cylinder.\n    3 for volume of cuboid.");
        int n=in.nextInt();
        Q7_2018 ob = new Q7_2018();
        if (n==1)
        {
            System.out.println("Enter radius of sphere : ");
            double R = in.nextDouble();
            V=ob.volume(R);
            System.out.println("Volume of sphere = "+V);
        }
        if (n==2)
        {
            System.out.println("Enter height of cylinder : ");
            double H = in.nextDouble();
            System.out.println("Enter radius of cylinder : ");
            double R = in.nextDouble();
            V=ob.volume(H,R);
            System.out.println("Volume of cylinder = "+V);
        }
        if (n==3)
        {
            System.out.println("Enter length of cuboid : ");
            double L = in.nextDouble();
            System.out.println("Enter breadth of cuboid : ");
            double B = in.nextDouble();
            System.out.println("Enter height of cuboid : ");
            double H = in.nextDouble();
            V= ob.volume(L,B,H);
            System.out.println("Volume of cuboid = "+V);
        }
    }
}