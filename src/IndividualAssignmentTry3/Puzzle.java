package IndividualAssignmentTry3;

import java.util.ArrayList;
import java.util.Scanner;

public class Puzzle {
    private int puzzleId;
    private String puzzleName;
    private String puzzleDescription;
    private String puzzleHint;
    private int puzzleAnswer;
    private int puzzleTrys;


    //constructor

    public Puzzle(int puzzleId, String puzzleName, String puzzleDescription, String puzzleHint, int puzzleAnswer, int puzzleTrys) {
        this.puzzleId = puzzleId;
        this.puzzleName = puzzleName;
        this.puzzleDescription = puzzleDescription;
        this.puzzleHint = puzzleHint;
        this.puzzleAnswer = puzzleAnswer;
        this.puzzleTrys = puzzleTrys;
    }

    //getters and setters

    public int getPuzzleId() {
        return puzzleId;
    }

    public void setPuzzleId(int puzzleId) {
        this.puzzleId = puzzleId;
    }

    public String getPuzzleName() {
        return puzzleName;
    }

    public void setPuzzleName(String puzzleName) {
        this.puzzleName = puzzleName;
    }

    public String getPuzzleDescription() {
        return puzzleDescription;
    }

    public void setPuzzleDescription(String puzzleDescription) {
        this.puzzleDescription = puzzleDescription;
    }

    public String getPuzzleHint() {
        return puzzleHint;
    }

    public void setPuzzleHint(String puzzleHint) {
        this.puzzleHint = puzzleHint;
    }

    public int getPuzzleAnswer() {
        return puzzleAnswer;
    }

    public void setPuzzleAnswer(int puzzleAnswer) {
        this.puzzleAnswer = puzzleAnswer;
    }

    public int getPuzzleTrys() {
        return puzzleTrys;
    }

    public void setPuzzleTrys(int puzzleTrys) {
        this.puzzleTrys = puzzleTrys;
    }


    //methods
    //---Find Puzzle elements---------------------------------------------------------------------------------------
    public static boolean findPuzzleID(int numId) {
        for (Puzzle i : ADVGame.listOfPuzzles) {
            if (numId == i.getPuzzleId()) {
                return true;

            }
        }

        return false;
    }

    public static String findPuzzleName(int numName) {
        for (Puzzle i : ADVGame.listOfPuzzles) {
            if (numName == i.puzzleId) {
                return i.puzzleName;

            }
        }
        return null;
    }

    public static String findPuzzleDescription(int numDesripotion) {
        for (Puzzle i : ADVGame.listOfPuzzles) {
            if (numDesripotion == i.puzzleId) {
                return i.puzzleDescription;

            }
        }
        return null;
    }

    public static int findPuzzleAnswer(int numId) {
        for (Puzzle i : ADVGame.listOfPuzzles) {
            if (numId == i.getPuzzleId()) {
                return i.getPuzzleAnswer();

            }
        }

        return 0;
    }

    public static int findPuzzletries(int numId) {
        for (Puzzle i : ADVGame.listOfPuzzles) {
            if (numId == i.getPuzzleId()) {
                return i.getPuzzleTrys();

            }
        }

        return 0;
    }

    public static String findPuzzleHint(int numHint) {
        for (Puzzle i : ADVGame.listOfPuzzles) {
            if (numHint == i.puzzleId) {
                return i.puzzleHint;

            }
        }
        return null;
    }
    //---Find Puzzle elements ends-----------------------------------------------------------------------------------


    //---Puzzle Game-------------------------------------------------------------------------------------------------
    //keeps track if player wins game so puzzle disappears from room
    static ArrayList puzzleWin = new ArrayList();

    public static String explorepuzles(String exploreCommad, int itemInRoom) {

        //to use non static method in static method
        Puzzle puzzle = new Puzzle(0, null, null, null, 0, 0);

        if (exploreCommad.equalsIgnoreCase("explore")) {

            if (!puzzleWin.isEmpty()) {

                System.out.println("There is nothing in this room ");

            } else if (findPuzzleID(itemInRoom) == true && puzzleWin.isEmpty()) {

                System.out.println("       \"The puzzle called " + findPuzzleName(itemInRoom) + " is in this room\"");
                Scanner input = new Scanner(System.in);
                System.out.println("        -Would you like to play. Y or N ");
                System.out.println("        -Full disclosure, when games starts you have to finish before leaving and you get three tries.");
                System.out.println("        -Hint will be available after first try.");

                System.out.print(">");
                String puzzleInput = input.nextLine();

                if (puzzleInput.equalsIgnoreCase("Yes") || puzzleInput.equalsIgnoreCase("Y")) {

                    puzzle.puzzleGame(itemInRoom);

                } else if (puzzleInput.equalsIgnoreCase("No") || puzzleInput.equalsIgnoreCase("n")) {

                    System.out.println("        Ok, I guess you don't want to play.");

                } else {
                    System.out.println("Not a command");
                    System.out.println("        -Would you like to play. Y or N ");
                    System.out.print(">");
                    puzzleInput = input.nextLine();
                }
            }
        }
        return null;
    }


    //keeps track of tries
    int numberOfTries = 0;

    public void puzzleGame(int findTheRightGame) {

        if (puzzleWin.isEmpty()) {

            Scanner input2 = new Scanner(System.in);
            System.out.println("        \"" + findPuzzleDescription(findTheRightGame) + "\"");
            System.out.print(">");
            int puzzleA = input2.nextInt();

            //keeps track of tries
            numberOfTries = findPuzzletries(findTheRightGame);

            boolean valid = false;
            while (!valid) {

                if (puzzleA == findPuzzleAnswer(findTheRightGame)) {

                    System.out.println("        Hurray, you solved the puzzle correctly!");
                    valid = true;
                    //This makes sure the puzzle is not playable again after first win
                    puzzleWin.add(1);

                }

                //decreases player ties by 1 from 3/ keeps track of tries
                numberOfTries = numberOfTries - 1;
                //When players tries run out it exits the puzzle
                if (numberOfTries == 0 && puzzleWin.isEmpty()) {

                    System.out.println("        Game Over! You have have run out of tries");
                    valid = true;

                } else if (puzzleA != findPuzzleAnswer(findTheRightGame)) {

                    System.out.println("        Sorry that is not right.");
                    System.out.println("        You have " + numberOfTries + " tries left");

                    Scanner inputH = new Scanner(System.in);
                    System.out.println("        Would you like a hint? Y or N");
                    System.out.print(">");
                    String inputHint = inputH.nextLine();

                    if (inputHint.equalsIgnoreCase("Y") || inputHint.equalsIgnoreCase("Yes")) {

                        System.out.println("        " + findPuzzleHint(findTheRightGame));
                        System.out.println("        \"" + findPuzzleDescription(findTheRightGame) + "\"");
                        System.out.print(">");
                        puzzleA = input2.nextInt();

                    } else if (inputHint.equalsIgnoreCase("N") || inputHint.equalsIgnoreCase("No")) {

                        System.out.println("        \"" + findPuzzleDescription(findTheRightGame) + "\"");
                        System.out.print(">");
                        puzzleA = input2.nextInt();


                    } else {

                        System.out.println("        \"" + findPuzzleDescription(findTheRightGame) + "\"");
                        System.out.print(">");
                        puzzleA = input2.nextInt();

                    }
                }

            }

        }

    }

}
//---Puzzle Game ends--------------------------------------------------------------------------------------------

