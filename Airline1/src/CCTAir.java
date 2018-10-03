 import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CCTAir is the main method
 * 
 * @author Diana Agatha
 * @author Fernando Tenorio
 * @author Iago Freitas
 */
public class CCTAir {
    public static Flight flight;
    public static AirPlane plane;
    public static Pilot pilot;
   
    /**
     * Main Class
     * @param args
     * 
     */
    public static void main(String[] args) {

        Pilot pt = new Pilot();

        pt.setName("Fernando");
        

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        AirPlane ap1 = new AirPlane("Boeing", 505, 400);
        AirPlane ap2 = new AirPlane("Boeing", 968, 400);
        AirPlane ap3 = new AirPlane("Boeing", 756, 400);
        List<AirPlane> planes = new ArrayList<AirPlane>();
        planes.add(ap1);
        planes.add(ap2);
        planes.add(ap3);
        System.out.println("Enter First and Last Name: ");
        
      
        String fname = sc.next();
        if(clickToExit(fname)) exit();
        String lname = sc.next();
        if(clickToExit(lname)) exit();
        System.out.println("Enter Email");
        String email = sc.next();
        if(clickToExit(email)) exit();
        System.out.println("Select aircraft number: (0 to 2): ");
        int p = sc.nextInt();
        AirPlane pla = planes.get(p);
        
        
        Pilot plt = new Pilot(fname,lname,email,pla);
        System.out.println("Type Add to add Flight to the Pilot. Exit to exit the System.!");


        flight = addFlighToPilot(plt);
        
              
          System.out.println("Check Flights");
          
                
                System.out.println(flight.toString()); 
                printFlights();
     
    }

    /**
     * The method takes the object pilot as a parameter and assigns the pilot
     * to a flight
     * 
     * @param plt
     * @return 
     */
    public static Flight addFlighToPilot(Pilot plt) {
        
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            while(!answer.equals("add") && answer.equals("exit")){
                if(clickToExit(answer)) break;
  
                System.out.println("\n Invalid");
                answer = sc.next();
            }
            

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            if(answer.equals("add")){

                System.out.println("Select date of departure (dd/mm/yyyy): ");
                
                sc = new Scanner(System.in);
                String dateString = sc.next();
                Date date = null;
                try {
                    date = sdf.parse(dateString);
                 } catch (ParseException ex) {
                    System.err.print("Format date exception! Try again");
                }
//                
                System.out.println("Origin:");
                sc = new Scanner(System.in);
                String origin = sc.nextLine();
                System.out.println("Destiation");
                sc = new Scanner(System.in);
            
                answer = sc.nextLine();
                while(!answer.equals(answer) && !answer.equals(answer)){
                if(clickToExit(answer)) break;
                    sc = new Scanner(System.in);
                    error();
                    answer = sc.nextLine();
                    
                } 
             return new Flight(origin, answer, date , "#" +  randomNumber(), plt);    

        } else {
                return null;
            }

    }
   
    public static String randomNumber(){
        Random rand = new Random();
        return String.valueOf(500 + rand.nextInt((1000 - 500) + 1));
    }
    
    /**
     * Simple method created to exit 
     * 
     */
    public static void exit(){
        System.out.println("\n Exit!");
        System.exit(0);
    }
    
    /**
     * this method is to exit only if the return is true 
     * @param st
     * @return 
     */
    public static boolean clickToExit(String st){
        if(st.equals("exit")) return true;
        return false;
    }
    
    /**
     * Method prints out error message
     * 
     */
    public static void error(){
    System.out.println("\nInvalid input. Try again");
  }
    
    /**
     * The method creates and prints the flights
     * 
     */
    public static void printFlights(){
        
       AirPlane ap1 = new AirPlane("Boeing", 505, 400);
       AirPlane ap2 = new AirPlane("Boeing", 968, 400);
       AirPlane ap3 = new AirPlane("Boeing", 756, 400);
       
       Pilot p1 = new Pilot("Fernando", "Tenorio", "aaa@aaaa", ap1);
       Pilot p2 = new Pilot("Diana", "Agatha", "vvvv@aaaa", ap2);
       Pilot p3 = new Pilot("Iago", "Freitas", "iii@aaaa", ap3);
       
       Flight f1 = new Flight("Brazil", "Dublin", new Date(2018,01,12), "#55", p1);
       Flight f2 = new Flight("Madrid", "China", new Date(2018,02,12), "#552", p2);
       Flight f3 = new Flight("London", "Sao Paulo", new Date(2018,02,12), "#123", p3);
       Flight f4 = new Flight("Lisbon", "Rio de Janeiro", new Date(2018,10,12), "#2312", p1);
       Flight f5 = new Flight("Paris", "Toronto", new Date(2018,11,12), "#12312", p2);
        
       ArrayList<Flight> flights = new ArrayList<>();
       flights.add(f1);
       flights.add(f2);
       flights.add(f3);
       flights.add(f4);
       flights.add(f5);
       
       System.out.println("Type Flights to See Full list of flights.");
       
       Scanner sn = new Scanner(System.in);
       
       while(flights.add(f5) == sn.hasNextInt()){
           System.out.println(flights.add(f2));
            
       } 
        for (int i = 0; i<flights.size();i++){
            flights.get(i).schedule(2.00, 8.00);
            flights.get(i).schedule(2.15); 
            System.out.println(flights.get(i));
       } 
        
    }
    
}
  