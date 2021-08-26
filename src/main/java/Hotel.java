import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;



    public Hotel(){
        this.bedrooms = new ArrayList<>();
    }

    //check guests in and out

    //Add customer and bedroom to the arrays so they are not empty


    //Guests in

    public void checkIn(Guest guest, Bedroom bedroom){
        bedroom.checkInGuest(guest);

    }

    public void checkOut(Guest guest, Bedroom bedroom){
        bedroom.checkOutGuest(guest);
    }

}
