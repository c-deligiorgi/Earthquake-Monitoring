import java.util.ArrayList;
/**
 * The Monitoring class contains the a list of 
 * oservatory. Also provides methode to print
 * statistic values.
 *
 * @author (Christina Deligiorgi)
 * @version (1.0)
 */
public class Monitoring
{
    
  // list of all earthquake events
  private ArrayList<Observatory> listOfObs;

  /**
  * Construct the monitoring, creating new list of observatory. 
  */
  public Monitoring()
  {  
        // initialise instance variable
       this.listOfObs = new ArrayList<>();
       
  }
      
    
  /**
  * Add an observatory to the list. 
   *@param id The id number of the observatory.
   *@param name The observatory Name.
   *@param country The observatory country.
   *@param year The starting year of observation. 
   *@param area The covered area by the observatory.
  */
 public void addObs(int id, String name, String country, int year, int area)
  {
      //method to add observatories

      listOfObs.add(new Observatory(id , name, country, year, area));
      
  }
  
  /**
  * Add earthquake object to a specific observatory with an ID x.
     *@param x The id number of the observatory.
     *@param magnitude The earthquake magnitudes.
     *@param latitude The latitdue positon. 
     *@param longitude The longitude postion.
     *@param year The year when the event happend. 
  */
  public void addEarthquakeToObs (int x, double magnitude, double latitude, double longtitude, int year)
  { 
      for(Observatory events : listOfObs)
      
      {  
         if (x == events.getIndex())
         {
           
          events.addEarthquake(magnitude, latitude, longtitude, year);
    
         }
     }
    }

  /**
   * Get the largest average magnitude among all observatories.  
   */
  public void getAvgLargestMag()
  { 
      double largestAvg = 0;
          
       for(Observatory events : listOfObs)
       {
         if (largestAvg < events.getAverageMag())
         {
         
             largestAvg = events.getAverageMag();
             
         }
    
       }
      System.out.println(largestAvg);

  }
  
  /**
   * Get the largest magnitude ever recorded.  
   */
  public void getLargestEverMag()
  { 
      double largestEver = 0;
          
    for(Observatory events : listOfObs)
    {
    if (largestEver < events.getLargestMag())
    {
      
        largestEver = events.getLargestMag();
        
    }
    
    } 
    System.out.println(largestEver);

  }
    
  /**
   * Get the list of earthquakes have magnitude larger than number given. 
   * @ param y The given number. 
   */
  public void getListOfLargerThanNumber(double y)
  {
    for(Observatory list : listOfObs)
    { 
    
        list.getListOfEventsLargerThanx(y);
    
    }

  }
  
}


