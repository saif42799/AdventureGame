package IndividualAssignmentTry3;

import java.util.ArrayList;
import java.util.Scanner;

public class Item extends PlayerStats {
    private int itemId;
    private int itemIdentifier;
    private String itemName;
    private int itemPoints;
    private String itemDescription;

    //constructor

    public Item(int itemId, int itemIdentifier, String itemName, int itemPoints, String itemDescription, String playerName, int playerLifePoints, int damage, String playerItemInHand, Player player) {
        super(playerName, playerLifePoints, damage, playerItemInHand, player);
        this.itemId = itemId;
        this.itemIdentifier = itemIdentifier;
        this.itemName = itemName;
        this.itemPoints = itemPoints;
        this.itemDescription = itemDescription;
        this.player = player;
    }

    //getters and setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPoints() {
        return itemPoints;
    }

    public void setItemPoints(int itemPoints) {
        this.itemPoints = itemPoints;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }


    //method


    //Array for Item commands
    ArrayList<String> itemsPickedUp = new ArrayList<String>();
    ArrayList<String> itemInHand = new ArrayList<String>();

    //---Find Item elements---------------------------------------------------------------------------------------

    public static boolean findItemID(int numId) {
        for (Item i : ADVGame.listOfItems) {
            if (numId == i.itemId) {
                return true;

            }
        }

        return false;
    }

    public static int findItemIDInt(int numId) {
        for (Item i : ADVGame.listOfItems) {
            if (numId == i.itemId) {
                return i.itemId;

            }
        }

        return 0;
    }

    public static String findItemName(int numName) {
        for (Item i : ADVGame.listOfItems) {
            if (numName == i.itemId) {
                return i.itemName;

            }
        }
        return null;
    }

    public static String findItemNameString(String numName) {
        for (Item i : ADVGame.listOfItems) {
            if (numName.equalsIgnoreCase(i.itemName)) {
                return i.itemName;

            }
        }
        return null;
    }

    public static int findItemNameStringReturnInt(String numName) {
        for (Item i : ADVGame.listOfItems) {
            if (numName.equalsIgnoreCase(i.itemName)) {
                return i.itemId;

            }
        }
        return 0;
    }

    public static int findItemPoints(String numName) {
        for (Item i : ADVGame.listOfItems) {
            if (numName.equalsIgnoreCase(i.itemName)) {
                return i.itemPoints;

            }
        }
        return 0;
    }

    public static int findItemIdentigier(String numName) {
        for (Item i : ADVGame.listOfItems) {
            if (numName.equalsIgnoreCase(i.itemName)) {
                return i.itemIdentifier;

            }
        }
        return 0;
    }

    public static String findItemDescription(int numDesripotion) {
        for (Item i : ADVGame.listOfItems) {
            if (numDesripotion == i.itemId) {
                return i.itemDescription;

            }
        }
        return null;
    }

    public static String findItemDescriptionString(String stringDesripotion) {
        for (Item i : ADVGame.listOfItems) {
            if (stringDesripotion.equalsIgnoreCase(i.itemName)) {
                return i.itemDescription;

            }
        }
        return null;
    }
    //---Find Item elements---------------------------------------------------------------------------------------


    //---Item directory-------------------------------------------------------------------------------------------
    public void itemDirectory(String exploreCommad, int itemInRoom) {


        Scanner playerChoices = new Scanner(System.in);
        System.out.println("        -What would you like to do?");
        System.out.println("        -Commands: Pickup, Inspect, Drop, leave");
        System.out.print(">");
        String input = playerChoices.nextLine();

        if (input.equalsIgnoreCase("Pickup")) {
            pickUpItem(exploreCommad, itemInRoom);
        } else if (input.equalsIgnoreCase("Inspect")) {
            inspectItem(exploreCommad, itemInRoom);
        } else if (input.equalsIgnoreCase("Drop")) {
            dropItem(exploreCommad, itemInRoom);
        } else if (input.equalsIgnoreCase("leave")) {
            //leaves this section
        } else if (input.equalsIgnoreCase("Inventory")) {
            inventortyListener(exploreCommad, itemInRoom);
        } else {
            System.out.println("Invalid Command!");
            itemDirectory(exploreCommad, itemInRoom);
        }

    }

    //For main inventory directory
    public void itemDirectoryForMain(String exploreCommad, int itemInRoom) {

        Scanner playerChoices = new Scanner(System.in);
        System.out.println("        -What would you like to do?");
        System.out.println("        -Commands: Inspect, Drop, leave, Equip(E), Unequip(U)");
        System.out.print(">");
        String input = playerChoices.nextLine();

        if (input.equalsIgnoreCase("Inspect")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which item would you like to inspect?");
            System.out.print(">");
            String inspectItemInMain = scanner.nextLine();
            if (itemsPickedUp.contains(findItemNameString(inspectItemInMain))) {
                System.out.println(findItemDescriptionString(inspectItemInMain));
                itemDirectoryForMain(exploreCommad, itemInRoom);
            } else {
                System.out.println("That is not in your inventory or you don't have that item");
            }
        } else if (input.equalsIgnoreCase("Drop")) {
            dropItem(exploreCommad, itemInRoom);
        } else if (input.equalsIgnoreCase("leave")) {
            //leaves this section
        } else if (input.equalsIgnoreCase("Inventory")) {
            inventortyListener(exploreCommad, itemInRoom);
        } else if (input.equalsIgnoreCase("Equip") || input.equalsIgnoreCase("E") ||
                input.equalsIgnoreCase("Unequip") || input.equalsIgnoreCase("U")) {
            equipItemInMain(input, itemInRoom);
            itemDirectoryForMain(exploreCommad, itemInRoom);
        } else {
            System.out.println("Invalid Command!");
            itemDirectoryForMain(exploreCommad, itemInRoom);
        }

    }


    public void monsterInventoryListener(String listener, String exploreCommad, int itemInRoom) {

        if (listener.equalsIgnoreCase("Inventory")) {
            if (itemsPickedUp.isEmpty()) {
                System.out.println("You have not picked up any items yet!");
            } else {
                System.out.println("List of your Items: ");

                for (String i : itemsPickedUp) {
                    System.out.println("- " + i);
                }

            }
            itemDirectoryForMain(exploreCommad, itemInRoom);
        }

    }
    //---Item directory ends---------------------------------------------------------------------------------------


    //---Item/ puzzle directory------------------------------------------------------------------------------------
    public void exploreItems(String exploreCommad, int itemInRoom) {

        if (exploreCommad.equalsIgnoreCase("explore")) {

            if (findItemID(itemInRoom) == true && !itemsPickedUp.contains(findItemName(itemInRoom))) {

                System.out.println("       \"There is a " + findItemName(itemInRoom) + " in this room\"");
                itemDirectory(exploreCommad, itemInRoom);

            } else if (Puzzle.findPuzzleID(itemInRoom) == true) {

                Puzzle.explorepuzles(exploreCommad, itemInRoom);

            } else if (Monster.findMonsterID(itemInRoom) == true) {
                Monster.exploreMonster(exploreCommad, itemInRoom);


            } else {
                System.out.println("There is nothing in this room.");
            }


        }

    }
    //---Item/ puzzle directory ends-------------------------------------------------------------------------------


    //---Item method action----------------------------------------------------------------------------------------
    public void pickUpItem(String placeholder, int itemNumber) {

        if (!itemsPickedUp.contains(findItemName(itemNumber))) {

            itemsPickedUp.add(findItemName(itemNumber));
            System.out.println(findItemName(itemNumber) + " has been added to your inventory!");

            itemDirectory(placeholder, itemNumber);
        } else {
            System.out.println("There is nothing to pick up.");
            itemDirectory(placeholder, itemNumber);

        }

    }

    public void inspectItem(String placeholder, int itemNumber) {

        System.out.println(findItemDescription(itemNumber));
        itemDirectory(placeholder, itemNumber);

    }


    public void dropItem(String placeholder, int itemNumber) {

        Scanner inputDrop = new Scanner(System.in);
        System.out.println("Which item would you like to drop? ");
        System.out.print(">");
        String itemChosenToDrop = inputDrop.nextLine();

        if (itemsPickedUp.contains(findItemNameString(itemChosenToDrop))) {

            itemsPickedUp.remove(findItemNameString(itemChosenToDrop));
            System.out.println("The item " + itemChosenToDrop + " has been removed ");

            int id = findItemNameStringReturnInt(itemChosenToDrop);
//
//            int oo = findItemIndexInArray(ADVGame.listOfItems, id);
//
//            int room = ADVGame.findRoomNumber(itemNumber);
//            ADVGame.listOfItems.set(oo, new Item(id,null,null));

//            ADVGame.listOfItems.remove(oo);
//            ADVGame.listOfItems.add(oo,new int(id) );

//
//            room = ADVGame.listOfItems.indexOf(oo) ;


        } else if (!itemsPickedUp.contains(itemChosenToDrop)) {

            System.out.println("That is not in your inventory");

        }

        itemDirectory(placeholder, itemNumber);

    }


    //This method listen for keyword "Inventory" in item class
    public void inventortyListener(String placeholder, int itemNumber) {

        if (itemsPickedUp.isEmpty()) {
            System.out.println("You have not picked up any items yet!");
        } else {
            System.out.println("List of your Items: ");

            for (String i : itemsPickedUp) {
                System.out.println("- " + i);
            }

        }

        itemDirectory("\n" + placeholder, itemNumber);

    }

    //This method listen for keyword "Inventory" in main
    public void inventortyListenerForMain(String placeholder, int itemNumber) {

        if (itemsPickedUp.isEmpty()) {
            System.out.println("Current Health " + player.getLife());
            System.out.println("You have not picked up any items yet!");
        } else {
            System.out.println("List of your Items: ");

            for (String i : itemsPickedUp) {
                System.out.println("- " + i);
            }

        }

        itemDirectoryForMain("\n" + placeholder, itemNumber);

    }

    //---Item method action ends-----------------------------------------------------------------------------------


    //---Item equip/ un-equip--------------------------------------------------------------------------------------

    Player player = new Player();

    //this method equips what ever the player chooses to equip
    public void equipItemInMain(String answer, int itemNum) {


        if (answer.equalsIgnoreCase("E") || answer.equalsIgnoreCase("Equip")) {

            Scanner equipItemFormMain = new Scanner(System.in);
            System.out.println("What item would you like to equip.");
            System.out.print(">");
            String equipItem = equipItemFormMain.nextLine();

            if (itemInHand.isEmpty() && findItemIdentigier(equipItem) == 1) {

                if (itemsPickedUp.contains(findItemNameString(equipItem)) && findItemIdentigier(equipItem) == 1) {

                    itemInHand.add(findItemNameString(equipItem));
                    System.out.println("The item " + findItemNameString(equipItem) + " is now equipped.");
                    player.addPointsOfEquip(answer, findItemNameString(equipItem), getDamage());

                } else {
                    System.out.println("You don't have that item or you misspelled the item name.");
                }


            } else if (findItemIdentigier(equipItem) == -1 || findItemIdentigier(equipItem) == -2) {
                player.addPointsOfHealth(answer, findItemNameString(equipItem), player.getLife());
            } else {
                String temp = "";
                for (String i : itemInHand) {
                    temp = i;
                }

                System.out.println("The item " + temp + " is currently equipped.");
            }


        } else if (answer.equalsIgnoreCase("U") || answer.equalsIgnoreCase("Uneqip")) {
            Scanner unequipItemFormMain = new Scanner(System.in);
            System.out.println("What item would you like to unequip.");
            System.out.print(">");
            String unequipItem = unequipItemFormMain.nextLine();

            if (!itemInHand.isEmpty() && itemInHand.contains(findItemNameString(unequipItem))) {

                System.out.println("The item " + findItemNameString(unequipItem) + " has been unequipped.");
                player.addPointsOfEquip(answer, findItemNameString(unequipItem), getDamage());
                itemInHand.remove(0);

            } else if (findItemIdentigier(unequipItem) == -1 || findItemIdentigier(unequipItem) == -2) {

                System.out.println("The item " + findItemNameString(unequipItem) + " has been unequipped.");
                player.addPointsOfHealth(answer, findItemNameString(unequipItem), player.getLife());

            } else {
                System.out.println("No items are equipped!");
            }
        }

    }
    //---Item equip/ un-equip ends---------------------------------------------------------------------------------


}
