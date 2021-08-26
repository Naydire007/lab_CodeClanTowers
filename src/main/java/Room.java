import java.util.ArrayList;

public abstract class Room {

    //need to have capacity and collection of Guests

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        //this is to create an empty array
        this.guests = new ArrayList<>();
    }

    public void checkInGuest(Guest guest){
        this.guests.add(guest);

    }

    public  void checkOutGuest(Guest guest){
        this.guests.remove(guest);
    }




}
