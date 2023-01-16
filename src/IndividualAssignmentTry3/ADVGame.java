package IndividualAssignmentTry3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ADVGame {

    //contained list fro rooms, items, puzzles
    static ArrayList<Rooms> roomsArrayList = new ArrayList();
    static ArrayList<Item> listOfItems = new ArrayList();
    static ArrayList<Puzzle> listOfPuzzles = new ArrayList<>();
    static ArrayList<PlayerStats> listOfPlayerStats = new ArrayList<>();
    static ArrayList<Monster> listOfMonsters = new ArrayList<>();

    public static void main(String[] args) {

        //Object with reachable methods
        Rooms rooms = null;
        UserNav userNav = null;
        Item items = null;
        Puzzle puzzle = null;
        PlayerStats playerStats = null;
        Player player = new Player();
        Monster monster = null;


        //---Reading Rooms txt file---------------------------------------------------------------------------------
        File fileRooms = new File("src/IndividualAssignmentTry3/myRooms.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(fileRooms);
        } catch (Exception e) {
            System.out.println("Invalid File");
            System.exit(0);
        }

        try {
            while (scanner.hasNextLine()) {

                //Room Location Number
                int roomLocationNumber = scanner.nextInt();
                scanner.nextLine();

                //Room Name
                String roomName = scanner.nextLine();
                //Reading three line description
                String roomDescriptionLine1 = scanner.nextLine();
                String roomDescriptionLine2 = scanner.nextLine();
                String roomDescriptionLine3 = scanner.nextLine();
                String roomDescriptionOneLine = roomDescriptionLine1 + "\n" + roomDescriptionLine2 + "\n" + roomDescriptionLine3;
                //Read dashed line -------
                scanner.nextLine();
                //Reading Directions and correlating numbers
                String N = scanner.next();
                String N1num = scanner.next();
                int NnumberMain = Integer.parseInt(N1num);

                String E = scanner.next();
                String E2num = scanner.next();
                int EnumberMain = Integer.parseInt(E2num);

                String S = scanner.next();
                String S3num = scanner.next();
                int SnumberMain = Integer.parseInt(S3num);

                String W = scanner.next();
                String W4num = scanner.next();
                int WnumberMain = Integer.parseInt(W4num);

                scanner.nextLine();


                //Read dashed line -------
                scanner.nextLine();

                //added to object
                rooms = new Rooms(roomLocationNumber, roomName, roomDescriptionOneLine, N, E, S, W, NnumberMain, EnumberMain, SnumberMain, WnumberMain);
                userNav = new UserNav(roomLocationNumber, roomName, roomDescriptionOneLine, N, E, S, W, NnumberMain, EnumberMain, SnumberMain, WnumberMain);
                roomsArrayList.add(rooms);

            }
        } catch (Exception e) {

            System.out.println("Something went wrong reading rooms txt file!");
            System.exit(0);

        }
        //---Reading Rooms txt file ends----------------------------------------------------------------------------


        //---Reading PlayerStat File--------------------------------------------------------------------------------
        File fileFour = new File("src/IndividualAssignmentTry3/Player.txt");
        Scanner scannerForPlayerStat = null;

        //If file exists then continue
        try {
            scannerForPlayerStat = new Scanner(fileFour);
        } catch (Exception e) {
            System.out.println("Invalid File");
            System.exit(0);
        }

        try {

            while (scannerForPlayerStat.hasNextLine()) {

                String playerName = scannerForPlayerStat.nextLine();
                int playerLife = scannerForPlayerStat.nextInt();
                scannerForPlayerStat.nextLine();
                int damage = scannerForPlayerStat.nextInt();
                scannerForPlayerStat.nextLine();
                String playerEquip = scannerForPlayerStat.nextLine();
                //added to object
                playerStats = new PlayerStats(playerName, playerLife, damage, playerEquip, player);
                listOfPlayerStats.add(playerStats);

            }

        } catch (Exception e) {
            System.out.println("Reading player status File Error");
            System.exit(0);
        }
        //---Reading PlayerStat File ends---------------------------------------------------------------------------


        //---Reading Item File--------------------------------------------------------------------------------------
        File fileTwo = new File("src/IndividualAssignmentTry3/items.txt");
        Scanner scannerForItems = null;

        //If file exists then continue
        try {
            scannerForItems = new Scanner(fileTwo);
        } catch (Exception e) {
            System.out.println("Invalid File");
            System.exit(0);
        }

        try {

            while (scannerForItems.hasNextLine()) {

                int itemId = scannerForItems.nextInt();
                scannerForItems.nextLine();
                int itemIdentifier = scannerForItems.nextInt();
                scannerForItems.nextLine();
                String itemName = scannerForItems.nextLine();
                int itemPoints = scannerForItems.nextInt();
                scannerForItems.nextLine();
                String itemDesLine1 = scannerForItems.nextLine();
                String itemDesLine2 = scannerForItems.nextLine();
                String itemDescription = itemDesLine1 + "\n" + itemDesLine2;
                scannerForItems.nextLine();
                //added to object
                items = new Item(itemId, itemIdentifier, itemName, itemPoints, itemDescription, playerStats.getPlayerName(), playerStats.getPlayerLifePoints(), playerStats.getDamage(), playerStats.getPlayerItemInHand(), player);
                listOfItems.add(items);
            }

        } catch (Exception e) {
            System.out.println("Reading item File Error");
            System.exit(0);
        }
        //---Reading Item File ends---------------------------------------------------------------------------------


        //---Reading Puzzle File------------------------------------------------------------------------------------
        File fileThree = new File("src/IndividualAssignmentTry3/puzzles.txt");
        Scanner scannerForPuzzle = null;

        //If file exists then continue
        try {
            scannerForPuzzle = new Scanner(fileThree);
        } catch (Exception e) {
            System.out.println("Invalid File");
            System.exit(0);
        }

        try {

            while (scannerForPuzzle.hasNextLine()) {

                int puzzleId = scannerForPuzzle.nextInt();
                scannerForPuzzle.nextLine();
                String puzzleName = scannerForPuzzle.nextLine();
                String puzzleDescription = scannerForPuzzle.nextLine();
                String puzzleHint = scannerForPuzzle.nextLine();
                String puzzleAnswer = scannerForPuzzle.nextLine();
                int puzzleAnswerInt = Integer.parseInt(puzzleAnswer);
                String puzzleTrys = scannerForPuzzle.nextLine();
                int puzzleTrysInt = Integer.parseInt(puzzleTrys);
                scannerForPuzzle.nextLine();
                //added to object
                puzzle = new Puzzle(puzzleId, puzzleName, puzzleDescription, puzzleHint, puzzleAnswerInt, puzzleTrysInt);
                listOfPuzzles.add(puzzle);

            }

        } catch (Exception e) {
            System.out.println("Reading puzzle File Error");
            System.exit(0);
        }
        //---Reading Puzzle File ends-------------------------------------------------------------------------------

        //---Reading Monster File------------------------------------------------------------------------------------
        File filefive = new File("src/IndividualAssignmentTry3/Monster.txt");
        Scanner scannerForMonster = null;

        //If file exists then continue
        try {
            scannerForMonster = new Scanner(filefive);
        } catch (Exception e) {
            System.out.println("Invalid File");
            System.exit(0);
        }

        try {

            while (scannerForMonster.hasNextLine()) {

                int mondsterID = scannerForMonster.nextInt();
                scannerForMonster.nextLine();
                String monsterName = scannerForMonster.nextLine();
                String monLine1 = scannerForMonster.nextLine();
                String monLine2 = scannerForMonster.nextLine();
                String monsterDescription = monLine1 + "\n" + monLine2;
                int monsterAttackDamge = scannerForMonster.nextInt();
                int monsterThreshold = scannerForMonster.nextInt();
                int mosterLife = scannerForMonster.nextInt();

                monster = new Monster(mondsterID, monsterName, monsterDescription, monsterAttackDamge, monsterThreshold, mosterLife, player, items);
                listOfMonsters.add(monster);

            }

        } catch (Exception e) {
            System.out.println("Reading monster File Error");
            System.exit(0);
        }
        //---Reading Monster File ends-------------------------------------------------------------------------------


        //---Running the game---------------------------------------------------------------------------------------
        try {

            Scanner input = new Scanner(System.in);
            //Intro Question
            System.out.println("Would you like to play Adventure game demo Y/N: ");
            System.out.print("> ");
            String yesOrNo = input.nextLine();
            System.out.print("\n");

            String east = "EastStarter";
            userNav.compass(east);
            //This loop will start the game
            while (!yesOrNo.isEmpty()) {

                rooms.exitGame(yesOrNo);

                if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {


                    System.out.println("\n" + "Which direction do you want to go? Or type valid command (N,S,E,W) ");
                    System.out.print("> ");
                    String IDRoom = input.nextLine();
                    rooms.exitGame(IDRoom);


                    if (IDRoom != null) {

                        if (rooms.N.equalsIgnoreCase(userNav.userDirectionInput(IDRoom)) || rooms.S.equalsIgnoreCase(userNav.userDirectionInput(IDRoom)) ||
                                rooms.W.equalsIgnoreCase(userNav.userDirectionInput(IDRoom)) || rooms.E.equalsIgnoreCase(userNav.userDirectionInput(IDRoom))) {
                            userNav.compass(IDRoom);
                        } else if (IDRoom.equalsIgnoreCase("Explore")) {
                            items.exploreItems(IDRoom, userNav.getPlayer());
                        } else if (IDRoom.equalsIgnoreCase("Inventory")) {
                            items.inventortyListenerForMain(IDRoom, userNav.getPlayer());
                        } else if (IDRoom.equalsIgnoreCase("Health")) {
                            System.out.println("Current Health: " + player.getLife());
                            System.out.println("Current Attack Points: " + player.getUpdateDamage());
                        } else {
                            System.out.println("Not a valid command");
                        }


                    } else if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("No")) {
                        System.out.println("Good Bye!");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Response.");
                        System.out.println("Would you like to play Adventure game demo Y/N: ");
                        System.out.print("> ");
                        yesOrNo = input.nextLine();
                        rooms.exitGame(yesOrNo);
                    }

                } else if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("No")) {
                    System.out.println("Good Bye!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Response.");
                    System.out.println("Would you like to play Adventure game demo Y/N: ");
                    yesOrNo = input.nextLine();
                    rooms.exitGame(yesOrNo);
                }

            }

            //closing scanner
            input.close();

        } catch (Exception e) {
            System.out.println("Something went wrong in the Game!");
        }
        //---Running the game ends----------------------------------------------------------------------------------

        //closing scanner
        scanner.close();

    }


    // this methods finds the room number
    public static int findRoomNumber(int num) {

        for (Rooms i : roomsArrayList) {

            if (num == i.getRoomNumber()) {
                return i.roomNumber;
            }

        }
        return 0;

    }

    //finds room description
    public static String findRoomDescription(int num) {

        for (Rooms i : roomsArrayList) {

            if (num == i.getRoomNumber()) {
                return i.rooomDesricption;
            }

        }
        return null;

    }


    //this method finds the correlating number to direction North
    public static int findNCoreNumber(int num) {

        for (Rooms i : roomsArrayList) {

            if (num == i.getRoomNumber()) {
                return i.NCoreNumber;
            }

        }
        return 0;

    }

    //this method finds the correlating number to direction East
    public static int findECoreNumber(int num) {

        for (Rooms i : roomsArrayList) {

            if (num == i.getRoomNumber()) {
                return i.ECoreNumber;
            }

        }
        return 0;

    }

    //this method finds the correlating number to direction South
    public static int findSCoreNumber(int num) {

        for (Rooms i : roomsArrayList) {

            if (num == i.getRoomNumber()) {
                return i.SCoreNumber;
            }

        }
        return 0;

    }

    //this method finds the correlating number to direction West
    public static int findWCoreNumber(int num) {

        for (Rooms i : roomsArrayList) {

            if (num == i.getRoomNumber()) {
                return i.WCoreNumber;
            }

        }
        return 0;

    }


}
