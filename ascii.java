class ascii
{
    public static void main (String args[])
    {
        char ch1 ='A', ch2= 'a',ch3='Z',ch4='z',ch5='0',ch6='9';
        int a,b,c,d;
        a=(int)ch1;
        b=(int)ch2;
        c=(int)ch3;
        d=(int)ch4;
       
       System.out.println("The ASCII value of character A = " + a);
       System.out.println("The ASCII value of character a = " + b);
       System.out.println("The ASCII value of character Z = " + c);
       System.out.println("The ASCII value of character z = " + d);
       System.out.println((int)ch5 + " " +(int) ch6);
    }
}