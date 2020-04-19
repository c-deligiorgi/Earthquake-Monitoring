
import java.util.Scanner;
/**
 * This MonitoringIO class in an interface for the user. 
 * To use the other class. 
 * Entering input and getting output.
 *
 * @author (Christina Deligiorgi)
 * @version (1.0)
 */
public class MonitoringIO
{
    // A Scanner to input data. 
    private static Scanner input = new Scanner(System.in);
    // A new Monitoring object
    private static Monitoring monA = new Monitoring();
    
    /**
    *  This is the main method.
    */
    public static void main() 
    {
	new MonitoringIO();
    } 
    
    
    /**
     *  This method construct the class. 
     */
    public MonitoringIO() 
    {
      do
      {

        menu(); 
      
	switch (input.nextInt()) 
	{
	    case 1:
	    addObservatory();
	    break;
  
	    case 2:
	    addEarthquake();
	    break;
  
	    case 3:
	    getLargestEver();
	    break;
	    
	    case 4:
	    getLargestAverage();
	    break;
	    
	    case 5:
	    getListofEarthquakes();
	    break;
	    
	    case 6:
	    System.out.println("to go back Press 0");
	    System.out.println("Press 6 to Exit,");
	    break;
	    
	    default:
	    System.err.println ( "Unrecognized option" );
	    break;
	}
      }while(input.nextInt() != 6);
       System.out.println("See you next time");
     }
     
   /**
    * This method display the console menu.  
    */
    public void menu() 
    {

    System.out.println("\t¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
    System.out.println("\t MonitoringI/O Menu   ");
    System.out.println("\t¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
    System.out.println("1/ Enter Observatory Data");
    System.out.println("2/ Enter Earthquake Data");
    System.out.println("3/ Largest Magnitude");
    System.out.println("4/ Largest Average");
    System.out.println("5/ List of Earthquake given number");
    System.out.println("6/ Exit");
    }
    
   /**
     * This method enter the observatory data via terminal.
     */
    public void addObservatory()
   { 
     
     System.out.println("The ID of the Observatory is :");
     int id  = input.nextInt();
     
     String i = input.nextLine();  // This line is just to consume the \n.
   
     System.out.println("The name of the observatory is :");
     String nameOfObservatory = input.nextLine();
     System.out.println("");
   
     System.out.println("The name of the country which is located is :"); 
     String countryLocated = input.nextLine();
     System.out.println("");
     
     System.out.println("Intiniation year is :");
     int initiatYear = input.nextInt();
     System.out.println("");
   
     System.out.println("Area covered in km^2 by the observatory is  :");
     int areaCovered = input.nextInt();
     System.out.println("");
   
     
     monA.addObs(id , nameOfObservatory, countryLocated, initiatYear, areaCovered);
     
     System.out.println("Press 1 to return to menu");
   }
 
   /**
     * This method enter the earthquake data via terminal.
     * Note that, prior enter earthquake data specify the observatory id.  
     */
    public void addEarthquake()
   { 
    System.out.println("Enter the Observatory ID :");
    int id = input.nextInt();
    System.out.println("");
   
    System.out.println("the magnitude is :");
    double mag = input.nextDouble();
    System.out.println("");
   
    System.out.println("the latitude postion is :");
    double lat = input.nextDouble();
    System.out.println("");
   
    System.out.println("the longtitude postion is :");
    double lon = input.nextDouble();
    System.out.println("");
   
    System.out.println("the year of the event is :");
    int year = input.nextInt();
    System.out.println("");
   
    monA.addEarthquakeToObs(id , mag, lat, lon, year);
    System.out.println("Press 1 to return to menu");
  }
  
  /**
  * This method print the largest magnitude ever. 
  */
  public void getLargestEver()
  {
      System.out.println("The Largest earthquake :");
      monA.getLargestEverMag();
      System.out.println("");
      System.out.println("Press 1 to return to menu");
  }
  
  /**
  * This method print the largest average magnitude. 
  */
  public void getLargestAverage()
  {
      System.out.println("The Largest Average Magnitude :");
      monA.getAvgLargestMag();
      System.out.println("");
      System.out.println("Press 1 to return to menu");
  }
  
  /**
  *  This method print a list of earthquakes have magnitude larger than number given. 
  */
  public void getListofEarthquakes()
  {
    System.out.println("Enter a number :");
    double z = input.nextDouble();
    monA.getListOfLargerThanNumber(z);
    System.out.println("");
    System.out.println("Press 1 to return to menu");
  }
  
}

