import java.util.Scanner; 
class withoutParamVoid
{
    public void volm()
    {
        Scanner  in = new Scanner (System.in);
        System.out.println("Enter l,b,h");
        int l=in.nextInt(); 
        int b=in.nextInt() ;
        int h=in.nextInt();
        int vol;
        vol=l*b*h;
        System.out.println("volume = "+ vol);
    }
    public static void main (String args[])
      { 
          withoutParamVoid volume =new withoutParamVoid();
          
          volume.volm();
        }}