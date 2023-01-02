import java.util.Scanner;
class linear9
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the number of subjects");
           int nos=in.nextInt();
           System.out.println("Enter maximum marks of a subject");
           int max= in.nextInt();
           double marks[]= new double[nos];
            double val;String val2;
           String sub[] = new String[nos];
           System.out.println("Enter the subjects :");
           in.nextLine();
           for (int i=0;i<nos;i++)
           {
              val2=in.nextLine();
              sub[i]=val2;
         } 
          double total=0;
              for (int i=0;i<nos;i++)
           {   System.out.println("Enter your marks in "+ sub[i]);
               val= in.nextDouble();
               marks[i]=val;
               total+=val;
         }
           System.out.println("Enter the marks to be searched for :");
         int num = in.nextInt();
         int j ;
         int flag = 0 ;
         for (j = 0 ; j < nos ; j ++) {
            if (num == marks [j]) {
               flag = 1 ;
               break;
              }
          }
                
           if (flag == 1) {
           System.out.println ("Element found at " + (j + 1 ) + " position and these are your "+sub[j]+" marks..." );
            System.out.println ("Average Marks = "+(total/nos)+ "\nPercentage = "+((total/(nos*max))*100));
            
          }
          else {
           System.out.println ("Element was not found") ;
                        }
                    
        }      
    }
