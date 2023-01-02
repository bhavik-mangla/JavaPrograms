class pat3
{
    public static void main(String args[])
    {
        int z=1;
    double sum=0;
    int term = 2;
    for (int i=1;i<=10;i++)
    {  sum+=term;//sum=2;
        z*=-1;
         term=(term+2)* z;
    }
    
    System.out.println("SUM=" + sum);
}
}