
import java.util.ArrayList;
/**
 * A class to create Observatories.
 *
 * @author (Christina Deligiorgi)
 * @version (1.0)
 */
public class Observatory
{
    // name of the observatory
    private String name;
    // country in which is located
    private String country;
    // year earthquake observations started
    private int year;
    // area covered by the observatory
    private int area;
    // list of all earthquake events
    private ArrayList<Earthquake> listOfEvents;
    // Id of the Observatory
    private int id;
    /**
     * Initiates an observatory.
      *@param id The id number of the observatory.
      *@param name The observatory Name.
      *@param country The observatory country.
      *@param year The starting year of observation. 
      *@param area The covered area by the observatory.
     */
    public Observatory(int id, String name, String country, int year, int area)
   {  
        // initialise instance variables
        this.name = name;
        this.country = country;
        this.year = year;
        this.area = area;
        this.id = id;
        this.listOfEvents = new ArrayList<>();
   }
      
    
   
   /**
    * Method that adds a new Earthquake
     *@param magnitude The earthquake magnitudes.
     *@param latitude The latitdue positon. 
     *@param longitude The longitude postion.
     *@param year The year when the event happend. 
    */
   public void addEarthquake(double magnitude, double latitude, double longtitude, int year)
   {
      listOfEvents.add(new Earthquake(magnitude, latitude, longtitude, year));
     
   }
        
   
   /**
    * Print a list of earthquake events.
    */
   public void printEarthEvents()
   { 

           for(Earthquake events : listOfEvents)
           {
              System.out.print("The magnitude is: " + events.getMagnitude() +
                             ", The Position is: " +"(" + events.getLatitude()+","
                              + events.getLongtitude() +")" + 
                              ", The year is: " + events.getYear());
              
              System.out.println("");
              
           }
    
   }

   
    /**
    * Print a list of earthquake events.
    */
   public int getIndex()
    { 
       return id;
    }

           
   /**
    * @return The largest magnitude. 
    */
   public double getLargestMag()
   { 
      double largestValue = 0;
          
      for(Earthquake events : listOfEvents)
      {
        if (largestValue < events.getMagnitude())
         {
           largestValue = events.getMagnitude();
         }
    
       }
      return largestValue;
   }

 
   /**
    * @return The average of magnitudes. 
    */
    public double getAverageMag()
    { 
      double sumValue = 0;
      double averageValue;
          
        for(Earthquake events : listOfEvents)
          { 
            
              sumValue = sumValue + events.getMagnitude();
       
    
          }
     averageValue = sumValue / listOfEvents.size();
     return averageValue;
   }
 
   /**
    * Print a list of events larger than a given number.
    * @param x The given number.
    */
   public void getListOfEventsLargerThanx(double x)
  {
    for(Earthquake events : listOfEvents)
      {
        if (x < events.getMagnitude())
            {
              System.out.print("The magnitude is: " + events.getMagnitude() +
                             ", The Position is: " +"(" + events.getLatitude()+","
                              + events.getLongtitude() +")" + 
                              ", The year is: " + events.getYear());
              
              System.out.println("");
            }
     }

   }
  
}


