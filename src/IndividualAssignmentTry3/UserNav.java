package IndividualAssignmentTry3;

import static IndividualAssignmentTry3.ADVGame.*;

public class UserNav extends Rooms {


    public UserNav(int roomNumber, String roomName, String rooomDesricption, String n, String e, String s, String w, int NCoreNumber, int ECoreNumber, int SCoreNumber, int WCoreNumber) {
        super(roomNumber, roomName, rooomDesricption, n, e, s, w, NCoreNumber, ECoreNumber, SCoreNumber, WCoreNumber);
    }

    //reachable method from player class
    Player player = new Player();

    //method

    //This methods updates player location and directs to correlating room
    int reachablePL = 0;
    int temp = 1;
    public void compass(String direction) {

        //updates player location and holds value
        player.updatePlayerLocationM(temp);
        direction = userDirectionInput(direction);

        if (direction.equalsIgnoreCase("North")) {

            int corispodingingNum = findNCoreNumber(temp);
            visitedRoom(false, corispodingingNum);

            if (corispodingingNum == -1) {

                System.out.println("You can't go there");

            } else {

                temp = corispodingingNum;
                String roomDescriptiom = findRoomDescription(temp);
                System.out.println(roomDescriptiom);

            }

        } else if (direction.equalsIgnoreCase("East")) {

            int corispodingingNum2 = findECoreNumber(temp);
            visitedRoom(false, corispodingingNum2);

            if (corispodingingNum2 == -1) {

                System.out.println("You can't go there");

            } else {

                temp = corispodingingNum2;
                String roomDescriptiom = findRoomDescription(temp);
                System.out.println(roomDescriptiom);

            }

        } else if (direction.equalsIgnoreCase("South")) {

            int corispodingingNum3 = findSCoreNumber(temp);
            visitedRoom(false, corispodingingNum3);

            if (corispodingingNum3 == -1) {

                System.out.println("You can't go there");

            } else {

                temp = corispodingingNum3;
                String roomDescriptiom = findRoomDescription(temp);
                System.out.println(roomDescriptiom);

            }

        } else if (direction.equalsIgnoreCase("West")) {

            int corispodingingNum4 = findWCoreNumber(temp);
            visitedRoom(false, corispodingingNum4);

            if (corispodingingNum4 == -1) {

                System.out.println("You can't go there");

            } else {

                temp = corispodingingNum4;
                String roomDescriptiom = findRoomDescription(temp);
                System.out.println(roomDescriptiom);

            }

        } else if (direction.equalsIgnoreCase("EastStarter")) {

            String roomDescriptiom = findRoomDescription(temp);
            visitedRoom(false, temp);
            System.out.println(roomDescriptiom);

        }

        reachablePL = temp;


    }

    //gets player location used in main
    public int getPlayer(){
        return reachablePL;
    }


    //This method checks user input
    public String userDirectionInput(String direction) {

        if (direction.equalsIgnoreCase("N") || direction.equalsIgnoreCase("North")) {
            return "North";
        } else if (direction.equalsIgnoreCase("E") || direction.equalsIgnoreCase("East")) {
            return "East";
        } else if (direction.equalsIgnoreCase("S") || direction.equalsIgnoreCase("South")) {
            return "South";
        } else if (direction.equalsIgnoreCase("W") || direction.equalsIgnoreCase("West")) {
            return "West";
        } else if (direction.equalsIgnoreCase("EastStarter")) {
            return "EastStarter";
        }

        return null;
    }


}
