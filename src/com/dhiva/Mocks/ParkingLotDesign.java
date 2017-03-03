/* 
I'm the owner of a burgeoning parking lot empire. I'm still pretty small - I only have 3 lots in the greater downtown Seattle area, but my visions are grand. As such, I've hired you to design and build an automated system for managing my parking lots. Assume that you have access to all the latest in ticket-giving and ticket-accepting machines, a sensor network built into the parking lot, and programmable signs to give directions to customers. I want to charge customers by the amount of space they use in the lot (area) and the length of time they use the lot (time).

ASSUMPTIONS:
1. Each parking lot has only one level of parking.
2. The parking lot accomodates only cars.
3. Each parking lot has 100 spots.
*/

public class ParkingLot{
    public Level[] levels;
    public User[] users;
    public TicketValidationMachine ticketMachine;
    public Sensor sensor;
    
    public ParkingLot(int size){
       levels = new Level[size];
    }
    
    public float getDuration(){
       return ticketMachine.getDuration();
    }
    
    public int area(){
        return user.getArea();
    }
    
    public int getCost(){
        //process based on duration and area used by the user
    }
    
    public String provideDirections(){
        return sensor.getDirection;
    }
       
}


public class User{
    public String carType;
    public int spots;
    
    public void setSpotsNeeded(int count){
         spots = count;   
    }
    
    public int getArea(){
        return this.spots;
    }
    
}


public class Ticket{
    setTime(time);
}


public class TicketValidationMachine{
    public float timeIn;
    public float timeOut;
    public Ticket ticket;
    private float duration;
    
    public Ticket provideTickets(){
        ticket.setTime(timeIn);
        return ticket;
    }
    
    public void acceptTickets(){
        //accepts tickets
        timeOut = currentTime;
        processTicket();
    }
    
    private void processTicket(){
        //calculate total duration
        this.duration = timeIn - timeOut;
    }
    
    public getTotalDuration(){
        return this.duration;
    }
}


public class Sensor{
    //provides directions to free spots
}
 
 
public class ParkingSpot{
    public int spotNumber;
    private int area;
    //Assuming only one type of parking spot
    public String type;
    private boolean available = true;
    
    public void parkCar(){
        this.available = false;
    }
    
    public void unparkCar(){
        this.available = true;
    }
    
    public boolean getAvailability(){
         return this.available;
    }
    
    public int getArea(){
        return this.area;
    }
    
}


public class Level{
    public ArrayList<ParkingSpot> totalSpots;
    private int spotsRemaining;
    
    public Level(int size){
        totalSpots = new ArrayList<ParkingSpot>();
    }
    
    public int getAvailableSpotCount(){
        int count = 0;
        Iterator<ParkingSpot> i = totalSpots.iterator();
        while(i.hasNext()){
            if(i.next().getAvailability()==true)
                count++;
        }
        return count;
    }
    
}

