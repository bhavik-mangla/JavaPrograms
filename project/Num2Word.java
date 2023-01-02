package project;
/* Program Statement : JAVA PROGRAM TO PRINT THE NUMBER IN WORD UPTO 1000 
 * EXAMPLE : 25 IS TWENTY FIVE AND 1234 IS ONE THOUSAND TWO HUNDRED AND THIRTY FOUR */
//BEGINNING OF THE PROGRAM
import java.io.*;//importing package java.io
class Num2Word//beginning of class
{
    public static void main(String args[]) throws IOException {//beginning of main()
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String ty[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String ten[]={"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String unit[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.print("Enter a Number : ");
        int n=Integer.parseInt(br.readLine());              //TAKES THE VALUE FROM THE USER.
        /*CHECKING WHETHER TH NUMBER IS IN THE RANGE OF [1-9999] OR NOT */
        if(n<1 || n>9999)
            System.out.println("Out of Range");

        else{//beginning of else
            int th=n/1000; //FINDING THE DIGIT AT THOUSAND'S PLACE.
            int h=(n/100)%10;//FINDING THE DIGIT AT HUNDRED'S PLACE.
            int t=(n/10)%10;//FINDING THE DIGIT AT TEN'S PLACE.
            int u=n%10; //FINDING THE DIGIT AT UNIT'S PLACE.
            System.out.print("Output = ");
            /*CONDITION FOR PRINTING DIGIT AT THOUSAND'S PLACE , IS THAT IT SHOULD NOT BE ZERO*/
            if(th!=0)
                System.out.print(unit[th]+" Thousand");
            /*CONDITION FOR PRINTING DIGIT AT HUNDREDD'S PLACE , IS THAT IT SHOULD NOT BE ZERO*/
            if(h!=0)
                System.out.print(" "+unit[h]+" Hundred");
            /*CONDITION FOR PRINTING THE WORD "And"*/
            if((t!=0 || u!=0)&&(th!=0 || h!=0))
                System.out.print(" And");

            /*Condition for printing digit at ten's place*/
            if(t==1)
                System.out.print(" "+ten[u+1]);
            else   
                System.out.print(" "+ty[t]+" "+unit[u]);
        } //end of else
    }//end of main()
}//end of class
//program ends here
/*
 *                                       VARIABLE DESCRIPTION TABLE
 *                                       
 *              NAME                            DATA TYPE                       DESCRIPTION
 *              n                               String                   TAKES THE VALUE FROM THE USER
 *              ty                              String                   STORE THE VALUES OF 2 DIGIT NUMBER ENDING WITH 0.
 *              ten                             String                   STORE THE VALUES OF 2 DIGIT NUMBER FROM 10 - 19.
 *              unit                            int                      STORE THE VALUES OF 2 DIGIT NUMBER FROM 1 - 9.
 *              th                              int                      FINDING THE DIGIT AT THOUSAND'S PLACE.
 *              h                               int                      FINDING THE DIGIT AT HUNDRED'S PLACE
 *              t                               int                      FINDING THE DIGIT AT TEN'S PLACE.
 *              u                               int                      FINDING THE DIGIT AT UNIT'S PLACE.
 */
