
public class Person{
    String name;
    int phoneNumber;
    String mailId;
}

public class Employee extends Person{
    
}

public class Guest extends Person{
    
}

public class Reservation{
    int reservationID;
    double startTime;
    Person p;
    int partySize;
    
    public Reservation(int reservationID, double startTime, Person p, int size){
        this.reservationID = 
        //Initialize varibles
    }
}

public class ReservationSystem{
     HashMap<int, Reservation> table = new HashMap<>();
     
     public void CreateReservation(int id, double startTime, String name, int partySize){
         Reservation current = new Reservation(id, startTime)
         
     }
     public void cancelReservation(){}
     public Reservation getReservationDetails(){}
}
