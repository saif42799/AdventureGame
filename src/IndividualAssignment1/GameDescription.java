package IndividualAssignment1;

import static IndividualAssignment1.Game.find;

public class GameDescription {

    //attributes
    public int roomNumber;
    public String location;
    public String rooomDesricption;
    public String N;
    public String E;
    public String S;
    public String W;
    public int Nnumber;
    public int Enumber;
    public int Snumber;
    public int Wnumber;


    //constructor

    public GameDescription(int roomNumber, String location, String rooomDesricption, String n, String e, String s, String w, int nnumber, int enumber, int snumber, int wnumber) {
        this.roomNumber = roomNumber;
        this.location = location;
        this.rooomDesricption = rooomDesricption;
        N = n;
        E = e;
        S = s;
        W = w;
        Nnumber = nnumber;
        Enumber = enumber;
        Snumber = snumber;
        Wnumber = wnumber;
    }

    //getter and setters

    public int getRoomNumber() {
        return roomNumber;
    }

    public int setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return roomNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public int getNnumber() {
        return Nnumber;
    }

    public int setNnumber(int nnumber) {
        Nnumber = nnumber;
        return nnumber;
    }

    public int getEnumber() {
        return Enumber;
    }

    public int setEnumber(int enumber) {
        Enumber = enumber;
        return enumber;
    }

    public int getSnumber() {
        return Snumber;
    }

    public int setSnumber(int snumber) {
        Snumber = snumber;
        return snumber;
    }

    public int getWnumber() {
        return Wnumber;
    }

    public int setWnumber(int wnumber) {
        Wnumber = wnumber;
        return wnumber;
    }


    //method

    public void exitGame(String userInput){
        if (userInput.equalsIgnoreCase("ESC")){

            System.out.println("Thank you for playing! Good Bye!");
            System.out.println("________________________________");
            System.exit(0);
        }

    }


    //findMethod String
    public int findString(String b){

        realTimeLocation(b);

        for (GameDescription i : Game.listOfRooms ) {

            if (b.equalsIgnoreCase(i.N)) {
                return i.Nnumber;
            }
            else if (b.equalsIgnoreCase(i.S)){
                return Snumber;
            }
            else if (b.equalsIgnoreCase(i.E)){
                return Enumber;
            }
            else if ( b.equalsIgnoreCase(i.W)){
                return Wnumber;
            }
            else {
                return 0;
            }

        }
        return 0;

    }



    int temp = 1;
    int temp2 = 1;

    public int realTimeLocation(String input){


        GameDescription strater = find(temp2);
        temp = strater.roomNumber;

        if (temp == 1 && !input.isEmpty()){

            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(1);

                temp2 = setNnumber(1);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(1);

                temp2 = setSnumber(1);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(1);

                temp2 = setEnumber(2);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(1);

                temp2 = setWnumber(1);

                return temp;
            }


        }
        if (temp == 2 && !input.isEmpty()){

            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(2);

                temp2 = setNnumber(3);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(2);

                temp2 = setSnumber(4);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(2);

                temp2 = setEnumber(5);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(2);

                temp2 = setWnumber(1);

                return temp;
            }


        }
        if (temp == 3 && !input.isEmpty()){
            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(3);

                temp2 = setNnumber(3);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(3);

                temp2 = setSnumber(2);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(3);

                temp2 = setEnumber(3);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(3);

                temp2 = setWnumber(3);

                return temp;
            }


        }
        if (temp == 4 && !input.isEmpty()){
            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(4);

                temp2 = setNnumber(2);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(4);

                temp2 = setSnumber(3);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(4);

                temp2 = setEnumber(3);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(4);

                temp2 = setWnumber(3);

                return temp;
            }


        }
        if (temp == 5 && !input.isEmpty()){
            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(5);

                temp2 = setNnumber(6);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(5);

                temp2 = setSnumber(7);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(5);

                temp2 = setEnumber(8);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(5);

                temp2 = setWnumber(2);

                return temp;
            }


        }
        if (temp == 6 && !input.isEmpty()){
            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(6);

                temp2 = setNnumber(6);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(6);

                temp2 = setSnumber(5);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(6);

                temp2 = setEnumber(6);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(6);

                temp2 = setWnumber(6);

                return temp;
            }


        }
        if (temp == 7 && !input.isEmpty()){
            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(7);

                temp2 = setNnumber(5);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(7);

                temp2 = setSnumber(7);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(7);

                temp2 = setEnumber(7);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(7);

                temp2 = setWnumber(7);

                return temp;
            }


        }
        if (temp == 8 && !input.isEmpty()){
            if (input.equalsIgnoreCase(N)){
                temp = setRoomNumber(8);

                temp2 = setNnumber(8);

                return temp;
            }
            else if (input.equalsIgnoreCase(S)){
                temp = setRoomNumber(8);

                temp2 = setSnumber(8);

                return temp;
            }
            else if (input.equalsIgnoreCase(E)){
                temp = setRoomNumber(8);

                temp2 = setEnumber(8);

                return temp;
            }
            else if (input.equalsIgnoreCase(W)){
                temp = setRoomNumber(8);

                temp2 = setWnumber(5);

                return temp;
            }


        }

        return temp;

    }

}
