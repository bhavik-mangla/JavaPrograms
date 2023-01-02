class SeriesOVL
{
    double sum=0.0;
    int x,n;
   
    void sumSeries(int n,double x)
    {
               for (int i= 1;i<=n;i++)
            {
                  if (i%2==0) sum-=(double)x/i;
                  else sum+=(double)x/i;
            }
            System.out.println("Sum of the series : "+sum);
        } 
          void sumSeries(int n)
    {
               for (int i= 1;i<=n;i++)
            {
                 int x=1;
                 sum+=(double)x/i;
            }
            System.out.println("Sum of the series : "+sum);
    }
}