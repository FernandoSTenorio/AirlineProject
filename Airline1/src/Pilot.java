import java.util.Random;

/**
 *The class pilot stores all the data related to a pilot
 * 
 * @author Diana Agatha
 * @author Fernando Tenorio
 * @author Iago Freitas
 */
public class Pilot {
    
    private static int registerNumber;
    static String[] fname = {"Diana","Fernando","Iago"};
    static String[] lname= {"Agatha","Tenorio","Freitas"};
    static String[] email1={"diana@cct.com","fernando@cct.com","iago@cct.com"};
    private String firstName;
    private String surname;
    private String email;
    private AirPlane plane;
    

    /**
     * This constructor randomizes the Pilot data.
     * 
     */
    public Pilot(){
        firstName = pickAny(fname);
        surname = pickAny(lname);
        email = pickAny(email1);
     
    }
    
    /**
     * The constructor takes in all the parameters and initialize all the variables of the class.
     * 
     * @param name
     * @param surname
     * @param email
     * @param plane 
     */
    public Pilot(String name, String surname, String email, AirPlane plane){
        this.firstName = name;
        this.surname = surname;
        this.email = email;
        this.plane = plane;
        
    }
    /**
     * Get method
     * 
     * @return registerNumber
     */
    public int getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Set method
     * 
     * @param registerNumber 
     */
    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    /**
     * get method 
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Set method
     * 
     * @param name 
     */
    public void setName(String name) {
        this.firstName = name;
    }

    /**
     * 
     * @return 
     */
    public String getSurname() {
        return surname;
    }
    
    /**
     * This method creates a way to randomically picks an element of the array
     * 
     * @param choose
     * @return 
     */
    public String pickAny(String[] choose){
        Random rm = new Random();
        return choose[rm.nextInt(choose.length)];
    }

    /**
     * Set method
     * 
     * @param surname 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get method
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set method
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Get method
     * 
     * @return plane
     */
    public AirPlane getplane(){
        return plane;
    }
    
    /**
     * Set method
     * 
     * @param plane 
     */
    public void setplane(AirPlane plane){
        this.plane = plane;
    }
    /**
     * The method toString is created to return a textual representation of the object
     * 
     * @return textual representation
     */
    public String toString(){
        return "\n ID Number: "+registerNumber+"\n Name: " +firstName
                + "\n Surname: " +surname 
                + "\n email: " +email+ "\n Plane: " + plane.toString();
    }
    
    /**
     * The method toString is created to return a textual representation of the object
     * 
     * @return textual representation
     */
    public String Name(){
        return firstName + "" + surname;
    }   
}