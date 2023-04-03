import java.util.ArrayList;

public class Flight {

    PlaneType planeType;
    Pilot pilot;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    String departureTime;

    private ArrayList<Passenger> bookedPassengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;




    public Flight(PlaneType planeType, String flightNumber, String destination, String departureAirport, String departureTime){
        this.planeType = planeType;
        this.bookedPassengers = new ArrayList<Passenger>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDepartureAirport(){
        return this.departureAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public PlaneType getPlaneType(){
        return plane.getPlaneType();
    }

    public String bookPassenger(Passenger passenger){
        int capacity = this.planeType.getCapacity();
        int currentCapacity = bookedPassengers.size();
        int seatsRemaining = capacity-currentCapacity;
        if (seatsRemaining > 1){
            bookedPassengers.add(passenger);
            seatsRemaining -= 1;
            return "Seat booked";
        } else {
            return "Flight full";
        }
    }



}
