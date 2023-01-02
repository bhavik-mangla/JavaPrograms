class seriesQ7i_2016
 {
     
     void SumSeries(int n,double x)
     {
      double s=0;
      for(int i=1;i<=n;i++)
      {if(i%2==0)
          s=s-(x/i);
          else 
          s=s+(x/i);
    }
    System.out.println("Ssum = "+s);
    }
    

}
    
