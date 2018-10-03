


import java.util.Date;

/**
 * The class Flight stores data related to a commercial flight
 * 
 * @author Diana Agatha
 * @author Fernando Tenorio
 * @author Iago Freitas
 */
public class Flight 
{
  private String origin; 
  private String destination; 
  private double departure_time; 
  private double arrival_time;
  private String flightNumber;
  private Date dateOfFlight;
  private Pilot pilot; 
  
  /**
   * The constructor takes in all the parameters and initialize all the variables of the class.
   * 
   * @param ori
   * @param des
   * @param date
   * @param number
   * @param pilot 
   */
  public Flight(String ori, String des, Date date, String number, Pilot pilot)
  {
      this.origin = ori;
      destination = des;
      this.flightNumber = number;
      dateOfFlight = date;
      this.pilot = pilot;   
  }
    /**
     * Second constructor that takes the date and departure time as parameters
     * 
     * @param date
     * @param departure_time 
     */
    Flight(Date date, double departure_time) {
       this.dateOfFlight = date;
       this.departure_time = departure_time;
       
    }
    
    /**
     * Get method
     * 
     * @return dateOfFlight
     */
    public Date getDateOfFlight(){
        return dateOfFlight;
    }
    
    /**
     * Get method
     * 
     * @return destination
     */
    public String getDestination(){
        return destination;
    }
  
    /**
     * The method toString is created to return a textual representation of the object
     * 
     * @return textual representation
     */
    @Override
     public String toString()
    {
       
        
        return "\n\nFlight Information: \n"
                    +"\tDate: "+dateOfFlight
                    +"\n\tFrom: "+origin+ " to "+ destination
                    +"\n\tFlight time: "+departure_time +" to "+arrival_time 
                    +"\nAircraft: " + pilot.toString()
                    ;
        
    }
     
     /**
      * Set method
      * 
      * @param arrivalTime 
      */
     public void schedule(double arrivalTime)
     {
         arrival_time = arrivalTime;
     }
     
     /**
      * Set method
      * 
      * @param arrivalTime
      * @param departureTime 
      */
     void schedule(double arrivalTime, double departureTime)
     {
         arrival_time = arrivalTime;
         departure_time = departureTime;
     }
     
     /**
      * Method created to trow an error message when some unsupported input is typed
      * 
      * @param i
      * @return 
      */
    Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}