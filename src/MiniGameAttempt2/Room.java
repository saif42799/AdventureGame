package MiniGameAttempt2;

public class Room {

    public int roomLocation;
    public String roonname;
    public String roomDescription;

    public Room(int roomLocation, String location, String roomDescription) {
        this.roonname = location;
        this.roomDescription = roomDescription;
        this.roomLocation = roomLocation;
    }

    //getters and setters


    public int getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(int roomLocation) {
        this.roomLocation = roomLocation;
    }

    public String getRoonname() {
        return roonname;
    }

    public void setRoonname(String roonname) {
        this.roonname = roonname;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    //method
    //exit game method
    public void exitGame(String userInput){
        if (userInput.equalsIgnoreCase("ESC")){

            System.out.println("Thank you for playing! Good Bye!");
            System.out.println("________________________________");
            System.exit(0);
        }

    }




}
