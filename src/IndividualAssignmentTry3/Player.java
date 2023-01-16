package IndividualAssignmentTry3;

public class Player {

    private int updatePlayerLocation;


    //method
    public int updatePlayerLocationM(int numInserted) {

        updatePlayerLocation = numInserted;
        return numInserted;

    }


    //getters and setters
    public int getUpdatePlayerLocation() {
        return updatePlayerLocation;
    }

    public void setUpdatePlayerLocation(int updatePlayerLocation) {
        this.updatePlayerLocation = updatePlayerLocation;
    }


    //this method handle adding or subtracting to the players life points
    int updateLife = 100;
    int temp = 0;

    public void addPointsOfHealth(String equpOrUnequip, String whichItem, int damge) {
        updateLife = damge;
        int itemPoints = Item.findItemPoints(whichItem);

        if (Item.findItemIdentigier(whichItem) == -1 && damge < 100) {


            if (equpOrUnequip.equalsIgnoreCase("E") || equpOrUnequip.equalsIgnoreCase("Inventory")) {
                if (damge <= 100 && damge > 80) {
                    int broughtBackToLife = 100 % damge;
                    broughtBackToLife = broughtBackToLife + damge;
                    System.out.println("Health restored: " + broughtBackToLife);
                    updateLife = broughtBackToLife;

                } else {
                    updateLife = damge + 20;
                    System.out.println("Health restored: " + updateLife);
                }
            }

        } else if (equpOrUnequip.equalsIgnoreCase("U") && Item.findItemIdentigier(whichItem) == -2) {
            updateLife = updateLife - itemPoints;
            System.out.println("Current health points: " + updateLife);
        } else if (equpOrUnequip.equalsIgnoreCase("E") && Item.findItemIdentigier(whichItem) == -2) {
            updateLife = updateLife + itemPoints;
            System.out.println("Current health points: " + updateLife);
        } else {
            System.out.println("You are at full health!");
        }
    }


    //this method handle adding or subtracting to the players attack points
    int attack = 0;
    int temp2 = 0;

    public void addPointsOfEquip(String equpOrUnequip, String whichItem, int damge) {

        attack = damge;
        int itemDMPoints = Item.findItemPoints(whichItem);

        if (equpOrUnequip.equalsIgnoreCase("E")) {
            attack = attack + itemDMPoints;
            temp2 = attack;
            System.out.println("Current attack points: " + attack);
        } else if (equpOrUnequip.equalsIgnoreCase("U")) {

            attack = temp2 - itemDMPoints;

            temp2 = attack;
            System.out.println("Current attack points: " + attack);
        }

    }

    //getters and setter for health and damage
    public int getUpdateDamage() {
        return temp2;
    }

    public void setLife(int updateLife) {
        this.updateLife = updateLife;
    }

    public int getLife() {
        return updateLife;
    }


}
