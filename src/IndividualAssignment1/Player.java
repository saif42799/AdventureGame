package IndividualAssignment1;

import java.util.ArrayList;
import java.util.List;

import static IndividualAssignment1.Game.find;

public class Player extends GameDescription {
    public Player(int roomNumber, String location, String rooomDesricption, String n, String e, String s, String w, int nnumber, int enumber, int snumber, int wnumber) {
        super(roomNumber, location, rooomDesricption, n, e, s, w, nnumber, enumber, snumber, wnumber);
    }

    List<Integer> visitedRoom = new ArrayList<>();

    //method
    public void visitedRoom(Boolean tureOrFalse, int visited) {
        //checks if user went to already been to that room, adds room to array list, method checks that
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


    //player position
    public void compass(String i, int q) {

        if (q == 1) {
            if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N") ||
                    S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S") ||
                    W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W")) {

                System.out.println("You can't go that way!");

            } else if (E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")) {

                visitedRoom(false, 2);
                GameDescription strater = find(2);
                String east = strater.rooomDesricption;
                System.out.println(east);

            } else {
                System.out.println("Something went wrong in Nav");
            }


        }

        if (q == 2) {
            if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N")) {
                visitedRoom(false, 3);

                GameDescription strater = find(3);
                String North = strater.rooomDesricption;
                System.out.println(North);

            } else if (S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S")) {
                visitedRoom(false, 4);

                GameDescription strater = find(4);
                String South = strater.rooomDesricption;
                System.out.println(South);

            } else if (W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W")) {
                visitedRoom(false, 1);

                GameDescription strater = find(1);
                String West = strater.rooomDesricption;
                System.out.println(West);

            } else if (E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")) {
                visitedRoom(false, 5);

                GameDescription strater = find(5);
                String East = strater.rooomDesricption;
                System.out.println(East);


            } else {
                System.out.println("Something went wrong in Nav");
            }

        }

        if (q == 3) {
            if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N") ||
                    W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W") ||
                    E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")) {

                System.out.println("You can't go that way!");

            } else if (S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S")) {
                visitedRoom(false, 2);

                GameDescription strater = find(2);
                String South = strater.rooomDesricption;
                System.out.println(South);

            } else {
                System.out.println("Something went wrong in Nav");
            }


        }

        if (q == 4) {
            if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N")) {
                visitedRoom(false, 2);

                GameDescription strater = find(2);
                String North = strater.rooomDesricption;
                System.out.println(North);


            } else if (S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S") ||
                    W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W") ||
                    E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")
            ) {

                System.out.println("You can't go that way!");

            } else {

                System.out.println("Something went wrong in Nav");

            }


        }

        if (q == 5) {
            if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N")) {
                visitedRoom(false, 6);

                GameDescription strater = find(6);
                String North = strater.rooomDesricption;
                System.out.println(North);

            } else if (S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S")) {
                visitedRoom(false, 7);

                GameDescription strater = find(7);
                String South = strater.rooomDesricption;
                System.out.println(South);

            } else if (W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W")) {
                visitedRoom(false, 2);

                GameDescription strater = find(2);
                String West = strater.rooomDesricption;
                System.out.println(West);

            } else if (E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")) {
                visitedRoom(false, 8);

                GameDescription starter = find(8);
                String East = starter.rooomDesricption;
                System.out.println(East);

            } else {
                System.out.println("Something went wrong in Nav");
            }


        }

        if (q == 6) {
            if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N") ||
                    W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W") ||
                    E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")) {

                System.out.println("You can't go that way!");

            } else if (S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S")) {
                visitedRoom(false, 5);

                GameDescription strater = find(5);
                String South = strater.rooomDesricption;
                System.out.println(South);

            } else {

                System.out.println("Something went wrong in Nav");

            }

        }

        if (q == 7) {
            if (S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S") ||
                    W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W") ||
                    E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")) {

                System.out.println("You can't go that way!");

            } else if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N")) {
                visitedRoom(false, 5);

                GameDescription strater = find(5);
                String South = strater.rooomDesricption;
                System.out.println(South);

            } else {

                System.out.println("Something went wrong in Nav");

            }

        }

        if (q == 8) {
            if (N.equalsIgnoreCase(i) || N.equalsIgnoreCase("N") ||
                    S.equalsIgnoreCase(i) || S.equalsIgnoreCase("S") ||
                    E.equalsIgnoreCase(i) || E.equalsIgnoreCase("E")
            ) {

                System.out.println("You can't go that way!");

            } else if (W.equalsIgnoreCase(i) || W.equalsIgnoreCase("W")) {
                visitedRoom(false, 5);

                GameDescription strater = find(5);
                String West = strater.rooomDesricption;
                System.out.println(West);


            } else {

                System.out.println("Something went wrong in Nav");

            }


        }

    }

}
