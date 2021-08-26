public class Bedroom extends Room{

    private int number;
    private RoomType type;

    public Bedroom (int number, RoomType type){
        super(type.getValue());
        this.number = number;
        this.type = type;

    }
}
