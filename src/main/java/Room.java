import java.util.ArrayList;

public class Room {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int nightyRate;
    private String name;
    private boolean booked;


    public Room(int roomNumber, int capacity, String type, int nightyRate, String name, boolean booked){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.nightyRate = nightyRate;
        this.guests = new ArrayList<>();
        this.name = name;
        this.booked = booked;


    }

    public int getGuestCount(){
       return  this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public boolean booked(){
        return this.booked;
    }

    public int getNightyRate(){
        return this.nightyRate;
    }






}
