import java.util.Scanner;
class withParam
{
    public static int volm(int l,int b,int h)
    {
        int vol;
        vol=l*b*h;
        return vol;
    }
    public static void main (String args[])
      { 
        System.out.println("Enter l,b,h");
        Scanner in = new Scanner(System.in);
        int length=in.nextInt();
        int bredth= in.nextInt();
         int height=in.nextInt();
         int volume= volm(length,bredth,height);
         System.out.println("Volume = "+volume);
        }
    }