package IndividualAssignmentTry3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Monster {
    private int monsterID;
    private String monsterName;
    private String monsterDescription;
    private int monsterAttackDamage;
    private int threshold;
    private int monsterLife;
    private static Player player;
    private static Item item;

    //constructor
    public Monster(int monsterID, String monsterName, String monsterDescription, int monsterAttackDamage, int threshold, int monsterLife, Player player, Item item) {
        this.monsterID = monsterID;
        this.monsterName = monsterName;
        this.monsterDescription = monsterDescription;
        this.monsterAttackDamage = monsterAttackDamage;
        this.threshold = threshold;
        this.monsterLife = monsterLife;
        this.player = player;
        this.item = item;
    }

    //getter and setters
    public int getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }

    public int getMonsterAttackDamage() {
        return monsterAttackDamage;
    }

    public void setMonsterAttackDamage(int monsterAttackDamage) {
        this.monsterAttackDamage = monsterAttackDamage;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getMonsterLife() {
        return monsterLife;
    }

    public void setMonsterLife(int monsterLife) {
        this.monsterLife = monsterLife;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }


    //methods
    //---Find Monster elements---------------------------------------------------------------------------------------
    public static boolean findMonsterID(int numId) {
        for (Monster i : ADVGame.listOfMonsters) {
            if (numId == i.monsterID) {
                return true;

            }
        }

        return false;
    }

    public static String findMonsterDescription(int numId) {
        for (Monster i : ADVGame.listOfMonsters) {
            return i.monsterDescription;
        }
        return null;
    }

    public static String findMonsterName(int numId) {
        for (Monster i : ADVGame.listOfMonsters) {
            return i.monsterName;
        }
        return null;
    }

    public static int findMonsterAttackDamage(int numId) {
        for (Monster i : ADVGame.listOfMonsters) {
            return i.monsterAttackDamage;
        }
        return 0;
    }

    public static int findMonsterThreshold(int numId) {
        for (Monster i : ADVGame.listOfMonsters) {
            return i.threshold;
        }
        return 0;
    }

    public static int findMonsterLife(int numId) {
        for (Monster i : ADVGame.listOfMonsters) {
            return i.monsterLife;
        }
        return 0;
    }

    //---Find Monster elements ends----------------------------------------------------------------------------------

    //for player win so monster disappears
    static ArrayList monsterWin = new ArrayList();

    //this methods is an intro to the moster and a director to the monster fight
    public static String exploreMonster(String exploreCommad, int itemInRoom) {


        if (exploreCommad.equalsIgnoreCase("explore")) {

            if (!monsterWin.isEmpty()) {

                System.out.println("There is nothing in this room ");

            } else if (findMonsterID(itemInRoom) == true && monsterWin.isEmpty()) {

                System.out.println("       There is a monster in this room! It's \"" + findMonsterName(itemInRoom) + "\"");
                System.out.println("       \"" + findMonsterName(itemInRoom) + "\"" + " has a fixed attack damage of " + findMonsterAttackDamage(itemInRoom) + " points.");
                Scanner input = new Scanner(System.in);
                System.out.println("        -What would you like to do? Attack, Ignore, or leave");
                System.out.println("        -Full disclosure, if you attack you have to kill the monster before leaving the room.");
                System.out.print(">");
                String monsterInput = input.nextLine();

                if (monsterInput.equalsIgnoreCase("Attack")) {

                    System.out.println();
                    monsterFight(exploreCommad, itemInRoom);

                } else if (monsterInput.equalsIgnoreCase("Ignore")) {
                    int defaultWin = 1;
                    monsterWin.add(defaultWin);
                    System.out.println("Poof the monster has disappeared");

                } else if (monsterInput.equalsIgnoreCase("leave")) {
                    System.out.println("The monster will be waiting for you.");
                } else {
                    System.out.println("Not a command");
                    System.out.println("        -What would you like to do. Attack or Ignore ");
                    System.out.print(">");
                    monsterInput = input.nextLine();
                }


            }
        }


        return null;
    }

    //this method is responsible for the fight
    public static void monsterFight(String exploreCommad, int findTheRightFight) {

        Random random = new Random();

        System.out.println("\"" + findMonsterDescription(findTheRightFight) + "\"");
        System.out.println();
        System.out.println("-----Combat Mode-----");
        System.out.println("Commands:  A = Attack ");
        System.out.println("           Inventory = displays inventory");


        int monsterHealth = findMonsterLife(findTheRightFight);
        int playerHealth = player.getLife();


        boolean theVictor = false;
        while (!theVictor) {

            int randomNumber = random.nextInt(8);

            Scanner playerAction = new Scanner(System.in);
            System.out.print(">");
            String action = playerAction.nextLine();
            item.monsterInventoryListener(action, exploreCommad, findTheRightFight);

            if (action.equalsIgnoreCase("Attack") || action.equalsIgnoreCase("A")) {

                monsterHealth = monsterHealth - player.getUpdateDamage();
                System.out.println("            Your Life: " + player.getLife() + "                Monster Life: " + monsterHealth);

                System.out.println(findMonsterName(findTheRightFight) + " attacks");

                if (randomNumber < findMonsterThreshold(findTheRightFight)) {
                    //regular damage
                    playerHealth = player.getLife() - findMonsterAttackDamage(findTheRightFight);
                    System.out.println("            Your Life: " + playerHealth + "                Monster Life: " + monsterHealth);
                    player.setLife(playerHealth);
                } else if (randomNumber >= findMonsterThreshold(findTheRightFight)) {
                    //double damage
                    playerHealth = player.getLife() - findMonsterAttackDamage(findTheRightFight) * 2;
                    System.out.println("            Your Life: " + playerHealth + "                Monster Life: " + monsterHealth);
                    player.setLife(playerHealth);
                }


            }

            System.out.println("-----Combat Mode-----");
            System.out.println("Commands:  A = Attack ");
            System.out.println("           Inventory = displays inventory");


            if (playerHealth <= 0) {
                System.out.println("You have lost! Would you like to restart of exit the game? ");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Commands: exit or restart");
                System.out.print(">");
                String loserPlayerInput = scanner.nextLine();

                if (loserPlayerInput.equalsIgnoreCase("restart")) {
                    System.out.println("_______________________________Game Reset_______________________________");
                    ADVGame.main(null);
                } else if (loserPlayerInput.equalsIgnoreCase("exit")) {
                    System.exit(0);
                } else {
                    // figure a loop out
                }

            } else if (monsterHealth <= 0) {
                int playerWin = 1;
                monsterWin.add(playerWin);
                theVictor = true;

            }

        }

        System.out.println("You have Won!!!! ");
        System.out.println("You can now wander the game as you wish.");

    }

}
