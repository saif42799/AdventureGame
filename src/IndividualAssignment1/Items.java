package IndividualAssignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Items  {

    private int itemId;
    private String itemName;
    private String itemDescription;
    private Object Puzzle;

    //constructor
    public Items(int itemId,String itemName, String itemDescription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    //so I can use the puzzle method
   Puzzle puzzle = new Puzzle(0, null, null,null);


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

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }




    //methods

    ArrayList<Items> itemsPickedUp = new ArrayList<Items>();

    public void explore(String exploreCommad, int itemInRoom){


        if (exploreCommad.equalsIgnoreCase("explore")){

            if (itemInRoom == 3 ){
                Items itemOChoice = Game.listOfItems.get(0);

                System.out.println(" \" There is a " + itemOChoice.getItemName() + " in this room \"");
                System.out.println("What would you like to do with this item? ");

                Scanner playerChoices = new Scanner(System.in);
                System.out.println("Commands: Pickup, Inspect, Drop, leave");
                String input = playerChoices.nextLine();

                if(input.equalsIgnoreCase("Pickup")){
                    pickUpItem(input, 0);
                }
                else if (input.equalsIgnoreCase("Inspect")){
                    inspectItem(input, 0);
                }
                else if(input.equalsIgnoreCase("Drop")){
                    dropItem(input, 0);
                }
                else if (input.equalsIgnoreCase("Leave")){

                }

            }
            else if (itemInRoom == 4){
                Items itemOChoice = Game.listOfItems.get(1);
                System.out.println("There is a " + itemOChoice.getItemName() + " in this room");
                Scanner playerChoices = new Scanner(System.in);
                System.out.println("Commands: Pickup, Inspect, Drop, leave");
                String input = playerChoices.nextLine();

                if(input.equalsIgnoreCase("Pickup")){
                    pickUpItem(input, 0);
                }
                else if (input.equalsIgnoreCase("Inspect")){
                    inspectItem(input, 0);
                }
                else if(input.equalsIgnoreCase("Drop")){
                    dropItem(input, 0);
                }
                else if (input.equalsIgnoreCase("Leave")){

                }

            }
            else if (itemInRoom == 6){
                Items itemOChoice = Game.listOfItems.get(2);
                System.out.println("There is a " + itemOChoice.getItemName() + " in this room");
                Scanner playerChoices = new Scanner(System.in);
                System.out.println("Commands: Pickup, Inspect, Drop, leave");
                String input = playerChoices.nextLine();

                if(input.equalsIgnoreCase("Pickup")){
                    pickUpItem(input, 0);
                }
                else if (input.equalsIgnoreCase("Inspect")){
                    inspectItem(input, 0);
                }
                else if(input.equalsIgnoreCase("Drop")){
                    dropItem(input, 0);
                }
                else if (input.equalsIgnoreCase("Leave")){

                }
            }
            else if (itemInRoom == 8){
                System.out.println("There is a puzzle to be solved!");
                Scanner puzzleChoices = new Scanner(System.in);
                System.out.println("Do you want to play? Y or N");
                String input = puzzleChoices.nextLine();
                if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Yes")){
                    puzzle.puszzle(input);
                }
                else {
                    System.out.println("Ok, leave my room then. Exit is West");
                }

            }
            else {
                System.out.println("There is nothing in this room.");
            }

        }
    }


    //pickup method
    public void pickUpItem(String commandPickUp, int theItemPickUp){
        if (commandPickUp.equalsIgnoreCase("Pickup")){

            Items itemDescription = Game.listOfItems.get(theItemPickUp);
            itemsPickedUp.add(itemDescription);
            System.out.println("Item has been added to your Inventory ");


        }

    }


    //Inspect Item method
    public void inspectItem(String commandInspect, int theItemInspect){

        if (commandInspect.equalsIgnoreCase("Inspect")){

            Items itemDescription = Game.listOfItems.get(theItemInspect);
            System.out.println("\" " + itemDescription.getItemDescription() + " \"");

        }

    }


    //add drop method
    public void dropItem(String commandDropItem, int theItemDropItem){
        if (commandDropItem.equalsIgnoreCase("Drop")){

        }
        else {

        }

    }



    //Inventory method
    public void inventory(String inventoryCommand){
        if (inventoryCommand.equalsIgnoreCase("Inventory")){
            if (itemsPickedUp.isEmpty()){
                System.out.println("You have not picked up any items yet!");
            }
            else {
                System.out.println("List of your Items: ");

                for (Items i : itemsPickedUp){
                    System.out.println(i.getItemName());
                }

            }

        }


    }







}
