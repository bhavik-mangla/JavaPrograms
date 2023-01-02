/*Program Statement : Define a class named movieMagic with the following description:
Instance variables/data members:
(i)         int year            –           to store the year of release of a movie
(ii)        String title        –           to store the title of the movie.
(iii)       float rating        –           to store the popularity rating of the movie. (minimum rating = 0.0 and maximum rating = 5.0)
Member Methods:
(i)         movieMagic()        -       Default constructor to initialize numeric data members to 0 and String data member to “”.
(ii)        void accept()       -        To input and store year, title and rating.
(iii)       void display()      -        To display the title of a movie and a message based on the rating as per the table below.
*/
package project;
import java.io.*;//importing package java.io 
class movieMagic//beginning of class
    {
     int year;//declaring variables                   
     String title;
     float rating;
  movieMagic() // default constructor
    {                                         //Default constructor to initialize numeric data members to 0 and String data member to “”.
     year = 0;
     rating = 0.0f; // notice the 'f'
     title = "";
    }//end of default constructor
  void accept() throws IOException{//beginning of accept()
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter the title of the movie : ");
     title = br.readLine();                                                  //Method To input and store year, title and rating.
     System.out.print("Enter the year of its release : ");
     year = Integer.parseInt(br.readLine());
     System.out.print("Enter the movie rating : ");
     rating = Float.parseFloat(br.readLine());
   }//end of accept()
  void display(){//beginning of display()        //Method to To display the title of a movie and a message based on the rating as per the table below.
     System.out.println("The title of the movie is : "+title); 
     if( rating >= 0.0 && rating <= 2.0 ) {                                            
      System.out.println("The movie was a Flop");
     }  else if( rating >= 2.1 && rating <= 3.4 ) {
      System.out.println("The movie was a Semi-hit");
     }  else if( rating >= 3.5 && rating <= 4.5 ) {
      System.out.println("The movie was a Hit");
     }  else if( rating >= 4.6 && rating <= 5.0 )  {
      System.out.println("The movie was a Super Hit");
     }  else  {
      System.out.println("Enter a valid movie rating in between 0.0 and 5.0");
    }
   }//end f display()
  public static void main(String args[]) throws IOException//beginning of main()
    {
     movieMagic ob = new movieMagic(); // creating object of the class movieMagic
     ob.accept();                      // calling the methods.
     ob.display();
    }//end of main()
    }//end of class()
    
    /* 
     *                              VARIABLE DESCRIPTION TABLE
     *                              
     *      NAME                           DATA TYPE                        DESCRIPTION
     *      year                           int                      To store the year of release of a movie.
     *      title                          String                   To store the title of the movie.
     *      rating                         float                    To store the popularity rating of the movie.      
     *                                                             (minimum rating = 0.0 and maximum rating = 5.0) 
     */