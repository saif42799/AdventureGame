package IndividualAssignmentTry3;

import java.util.ArrayList;
import java.util.List;

public class Rooms {

    //attributes
    public int roomNumber;
    public String roomName;
    public String rooomDesricption;
    public String N;
    public String E;
    public String S;
    public String W;
    public int NCoreNumber;
    public int ECoreNumber;
    public int SCoreNumber;
    public int WCoreNumber;


    //constructor
    public Rooms(int roomNumber, String roomName, String rooomDesricption, String n, String e, String s, String w, int NCoreNumber, int ECoreNumber, int SCoreNumber, int WCoreNumber) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.rooomDesricption = rooomDesricption;
        N = n;
        E = e;
        S = s;
        W = w;
        this.NCoreNumber = NCoreNumber;
        this.ECoreNumber = ECoreNumber;
        this.SCoreNumber = SCoreNumber;
        this.WCoreNumber = WCoreNumber;
    }


    //getter and setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public int setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRooomDesricption() {
        return rooomDesricption;
    }

    public void setRooomDesricption(String rooomDesricption) {
        this.rooomDesricption = rooomDesricption;
    }

    public String getN() {
        return N;
    }

    public void setN(String n) {
        N = n;
    }

    public String getE() {
        return E;
    }

    public void setE(String e) {
        E = e;
    }

    public String getS() {
        return S;
    }

    public void setS(String s) {
        S = s;
    }

    public String getW() {
        return W;
    }

    public void setW(String w) {
        W = w;
    }

    public int getNCoreNumber() {
        return NCoreNumber;
    }

    public void setNCoreNumber(int NCoreNumber) {
        this.NCoreNumber = NCoreNumber;
    }

    public int getECoreNumber() {
        return ECoreNumber;
    }

    public void setECoreNumber(int ECoreNumber) {
        this.ECoreNumber = ECoreNumber;
    }

    public int getSCoreNumber() {
        return SCoreNumber;
    }

    public void setSCoreNumber(int SCoreNumber) {
        this.SCoreNumber = SCoreNumber;
    }

    public int getWCoreNumber() {
        return WCoreNumber;
    }

    public void setWCoreNumber(int WCoreNumber) {
        this.WCoreNumber = WCoreNumber;
    }


    //method
    //this method listens for "esc" keyword. "esc" exit the game
    public static void exitGame(String userInput) {
        if (userInput.equalsIgnoreCase("ESC")) {

            System.out.println("Thank you for playing! Good Bye!");
            System.out.println("________________________________");
            System.exit(0);
        }

    }

    //checks if user went to already been to that room, adds room to array list, method checks arraylist
    List<Integer> visitedRoom = new ArrayList<>();

    public void visitedRoom(Boolean tureOrFalse, int visited) {

        int theRoom = setRoomNumber(visited);
        visited = theRoom;
        Boolean intExists = visitedRoom.contains(visited);

        if (intExists == true) {
            System.out.println("(----You have been here before----)");
        }

        if (visitedRoom.contains(visited)) {

        } else {
            visitedRoom.add(visited);
        }

    }


}
