import java.util.Scanner;
 class Q9_2016
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        boolean flag=false;
        System.out.print("COUNTRY NAME : ");
        String c = in.nextLine();
        String sw[] = {"CHICHEN ITZA","CHRIST THE REDEEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICCHU","PETRA","COLLOSSEUM"};
        String l[] = {"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
        for(int i=0;i<7;i++)
        {
            if (l[i].equalsIgnoreCase(c))
            {
                System.out.println(l[i]+" - "+sw[i]);
                flag=true;
            }
        }
        if(flag==false)
        System.out.println("Sorry Not Found!");
    }
}

