package IndividualAssignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: Game.java
 *
 * @author Saif Shaikh
 * @version 2022 1.3
 * Course : ITEC 3860
 * Spring 2022
 * Written: Feb 27, 2022
 * The adventure program you will create for this assignment and all followed up assignments is entirely
 * data driven. Just like your final project. The program itself doesn’t know the details of the game geography,
 * the objects that are distributed among the various rooms, or even the words used to move from place to place.
 * All such information is supplied in the form of data files, which the program uses to control its own operation.
 * The ultimate goal is if you run the program with different data files, the same program will guide its players
 * through different adventure games.
 */

public class Game {
    static ArrayList<GameDescription> listOfRooms = new ArrayList<>();
    static ArrayList<Items> listOfItems = new ArrayList<>();
    static ArrayList<Puzzle> listOfPuzzles = new ArrayList<>();


    public static void main(String[] args) {

        GameDescription gameDescription = null;
        Navigation navigation = null;
        Player player = null;
        Items items = null;
        Puzzle puzzle = null;

        //---Phase1-------------------------------------------------------------------------------------------------

        //create Room.txt file
        File file = new File("C:\\Users\\Saif4\\IdeaProjects\\SoftwareDevelopment\\src\\IndividualAssignment1\\Room.txt");
        Scanner scanner = null;

        //If file exists then continue
        try {
            scanner = new Scanner(file);
        } catch (Exception e) {
            System.out.println("Invalid File");
            System.exit(0);
        }


        try {
            //Reading file and assigning
            while (scanner.hasNextLine()) {
                //int roomNumber, String location, String rooomDesricption
                int roomNum = scanner.nextInt();
                scanner.nextLine();
                String location = scanner.nextLine();
                String roomDescriptionLine1 = scanner.nextLine();
                String roomDescriptionLine2 = scanner.nextLine();
                String roomDescriptionLine3 = scanner.nextLine();
                String roomDescription = roomDescriptionLine1 + "\n" + roomDescriptionLine2 + "\n" + roomDescriptionLine3;
                scanner.nextLine();

                String NMn = scanner.next();
                String N1num = scanner.next();
                int NnumberMain = Integer.parseInt(N1num);

                String EMn = scanner.next();
                String E2num = scanner.next();
                int EnumberMain = Integer.parseInt(E2num);

                String SMn = scanner.next();
                String S3num = scanner.next();
                int SnumberMain = Integer.parseInt(S3num);

                String WMn = scanner.next();
                String W4num = scanner.next();
                int WnumberMain = Integer.parseInt(W4num);

                scanner.nextLine();

                gameDescription = new GameDescription(roomNum, location, roomDescription, NMn, EMn, SMn, WMn, NnumberMain, EnumberMain, SnumberMain, WnumberMain);
                gameDescription = new Navigation(roomNum, location, roomDescription, NMn, EMn, SMn, WMn, NnumberMain, EnumberMain, SnumberMain, WnumberMain);
                player = new Player(roomNum, location, roomDescription, NMn, EMn, SMn, WMn, NnumberMain, EnumberMain, SnumberMain, WnumberMain);
                listOfRooms.add(gameDescription);


            }

            //---Reading Item File-------------------------------------------------------------------------------------------------
            File fileTwo = new File("src/IndividualAssignment1/items.txt");
            Scanner scannerForItems = null;

            //If file exists then continue
            try {
                scannerForItems = new Scanner(fileTwo);
            } catch (Exception e) {
                System.out.println("Invalid File");
                System.exit(0);
            }

            try {

               while (scannerForItems.hasNextLine()){

                   int itemId = scannerForItems.nextInt();
                   scannerForItems.nextLine();
                   String itemName = scannerForItems.nextLine();
                   String itemDesLine1 = scannerForItems.nextLine();
                   String itemDesLine2 = scannerForItems.nextLine();
                   String itemDescription  = itemDesLine1 + "\n" +  itemDesLine2;
                   scannerForItems.nextLine();

                   items = new Items(itemId,itemName,itemDescription);
                   listOfItems.add(items);

               }

            } catch (Exception e) {
                System.out.println("Reading item File Error");
                System.exit(0);
            }


            //---Reading Item File-------------------------------------------------------------------------------------------------

            //---Reading Puzzle File-------------------------------------------------------------------------------------------------
            File fileThree = new File("src/IndividualAssignment1/Puzzle.txt");
            Scanner scannerForPuzzle = null;

            //If file exists then continue
            try {
                scannerForPuzzle = new Scanner(fileThree);
            } catch (Exception e) {
                System.out.println("Invalid File");
                System.exit(0);
            }

            try {

                while (scannerForPuzzle.hasNextLine()){

                    int puzzleId = scannerForPuzzle.nextInt();
                    scannerForPuzzle.nextLine();
                    String puzzleName = scannerForPuzzle.nextLine();
                    String puzzleDescription = scannerForPuzzle.nextLine();
                    String puzzleHint = scannerForPuzzle.nextLine();
                    scannerForPuzzle.nextLine();

                    puzzle = new Puzzle(puzzleId, puzzleName,puzzleDescription,puzzleHint);
                    listOfPuzzles.add(puzzle);

                }

            } catch (Exception e) {
                System.out.println("Reading puzzle File Error");
                System.exit(0);
            }


            //---Reading Puzzle File-------------------------------------------------------------------------------------------------



            //---Phase2-------------------------------------------------------------------------------------------------


            Scanner input = new Scanner(System.in);

            System.out.print("Would you like to play Adventure game demo Y/N: ");

            String yesOrNo = input.nextLine();
            System.out.println("\n");

            //This loop will start the game
            //prints out intro room
            GameDescription strater = find(1);
            System.out.println(strater.rooomDesricption);

            while (!yesOrNo.isEmpty()) {

                gameDescription.exitGame(yesOrNo);

                if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {


                    System.out.println("\n" + "Which direction do you want to go? Or type valid command (North, South, East, West) ");
                    String IDRoom = input.nextLine();
                    gameDescription.exitGame(IDRoom);


                    if (IDRoom != null) {

                        if (gameDescription.N.equalsIgnoreCase(IDRoom) || IDRoom.equalsIgnoreCase("N") ||
                            gameDescription.S.equalsIgnoreCase(IDRoom) || IDRoom.equalsIgnoreCase("S") ||
                            gameDescription.W.equalsIgnoreCase(IDRoom) || IDRoom.equalsIgnoreCase("W") ||
                            gameDescription.E.equalsIgnoreCase(IDRoom) || IDRoom.equalsIgnoreCase("E")  ){



                            player.compass(IDRoom,gameDescription.realTimeLocation(IDRoom));


                        }
                        else if (IDRoom.equalsIgnoreCase("Explore")){

                            items.explore(IDRoom, gameDescription.realTimeLocation(IDRoom));

                        }
                        else if (IDRoom.equalsIgnoreCase("Inventory")){

                            items.inventory(IDRoom);

                        }
                        else {
                            System.out.println("Not a Command!");
                        }

                    }
                    else {
                        System.out.println("Something wrong happened trying to find the directions!");

                    }


                } else if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("No")) {
                    System.out.println("Good Bye!");
                    System.exit(0);

                } else {
                    System.out.println("Invalid Response.");
                    System.out.println("Would you like to play Adventure game demo Y/N: ");
                    yesOrNo = input.nextLine();
                    gameDescription.exitGame(yesOrNo);
                }

            }
            input.close();

        } catch (Exception e) {

            System.out.println("Something went wrong in Main phase 2.");

        }

        System.out.println("Thank you for playing! Good Bye!");
        System.out.println("________________________________");

        scanner.close();

    }




    public static Navigation find(int num){

        for (GameDescription i : listOfRooms ) {

            if (num == i.getRoomNumber()){
                return (Navigation) i;
            }

        }
        return null;

    }

    public static Navigation findRoom(String direc){

        for (GameDescription i : listOfRooms ) {

            if (direc.equalsIgnoreCase(i.getN())){
                return (Navigation) i;
            }
            else if (direc.equalsIgnoreCase(i.getS())){
                return (Navigation) i;
            }
            else if (direc.equalsIgnoreCase(i.getW())){
                return (Navigation) i;
            }
            else if (direc.equalsIgnoreCase(i.getE())){
                return (Navigation) i;
            }
            else {
                return null;
            }

        }
        return null;

    }



}
