
/**
 * A class to create Earthquake events.
 *
 * @author (Christina Deligiorgi)
 * @version (1.1)
 */
public class Earthquake
{
    // describes the magnitude of the Earthquake
    private double magnitude;
    // latitude of the position
    private double latitude;
    // logtitude of the position
    private double longtitude;
    // year of the event
    private int year;
    

    /**
     * Constructor for objects of class Earthquake
     */

    public Earthquake(double magnitude, double latitude, double longtitude, int year)
    {
        // initialise instance variables
        this.magnitude = magnitude;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.year = year;
    }
    
    /** 
     *@return The magnitude of the earthquake.
     */
    
    public double getMagnitude()
    { 
        
        return magnitude;
        
    }
    
    /**
    * @return The latitude of the earthquake
    */
   
    public double getLatitude()
   {
       
       return latitude;
       
   }
   
   /**
    * @return The longtitude of the earthquake
    */
   
   public double getLongtitude()
   {
        
       return longtitude;
        
   }
   
   /**
    * @return The year that the earthquake took place
    */
   public int getYear()
   {
       
       return year;
       
   }

   
}
