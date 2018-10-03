import java.util.Scanner;

/**
 * The AirPlane class stores the data about a commercial aircraft.
 * 
 * @author Diana Agatha
 * @author Fernando Tenorio
 * @author Iago Freitas
 */
public class AirPlane 
{
    private String make;
    private int model;
    private int capacity;
    
    
    /**
     * the constructor takes in all the parameters and initialize all the variables of the class.
     * 
     * @param mk
     * @param mdl
     * @param cp 
     */
    public AirPlane(String mk, int mdl, int cp)
    {
        make = mk;
        model = mdl;
        capacity = cp;
       
    }          
    
    /**
     * Get method
     * 
     * @return make
     */
    public  String getMake()
    {
        return make;
    }
    
    /**
     * Get method
     * 
     * @return model
     */
    public int getModel()
    {
        return model;
    }
    
    /**
     * Get method
     * 
     * @return capacity
     */
    public int getCapacity(){
        return capacity;
    }
    /**
     * 
     * @return capacity
     */
    public int capacity()
    {
        return capacity;
    }
    
    /**
     * The method take the object pilot as a parameter
     * 
     * @param p 
     */
    public void assignPilot(Pilot p)
    {
        String name = null;
        p.Name();
        
    }
    
    /**
     * The method toString is created to return a textual representation of the object
     * 
     * @return text representation 
     */
    public String toString()
    {
         return "Airplane Information: \n"+"\t\tAircraft : "+make+""
                + ""+model+"\n\t\tCapacity: "
                + ""+capacity+" seats";   
    }    
}