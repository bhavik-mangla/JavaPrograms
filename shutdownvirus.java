import java.io.*;
class shutdownvirus
{    
    public static void main(String args[]) throws IOException{
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME 2 BLUEJ WARNING ....DONT TRY 2 TRY 2 ");
        System.out.println("Enter the no. of seconds after which you want your computer to shutdown. MAKE DIS VIRUS AT HOME BEC U CANT");
        System.out.println("RAHUL IS GREAT AND YOU ARE HACKED");
        long a=Long.parseLong(br.readLine());
        Process proc = runtime.exec("shutdown -s -t "+a);
        System.out.println(" ");
    }
}