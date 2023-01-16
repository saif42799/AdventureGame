package MiniGameAttempt2;

public class Actor {

    private int Location;
    private String roomName;
    private String descrription;

    public Actor(int location, String roomName, String descrription) {
        Location = location;
        this.roomName = roomName;
        this.descrription = descrription;
    }

    public int getLocation() {
        return Location;
    }

    public void setLocation(int location) {
        Location = location;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDescrription() {
        return descrription;
    }

    public void setDescrription(String descrription) {
        this.descrription = descrription;
    }
}
