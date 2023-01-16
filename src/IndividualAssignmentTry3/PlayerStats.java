package IndividualAssignmentTry3;

public class PlayerStats {

private String playerName;
private int playerLifePoints;
private int damage;
private String playerItemInHand;
private Player player;

//constructor
    public PlayerStats(String playerName, int playerLifePoints, int damage, String playerItemInHand,Player player) {
        this.playerName = playerName;
        this.playerLifePoints = playerLifePoints;
        this.damage = damage;
        this.playerItemInHand = playerItemInHand;
        this.player = player;

    }


//getters and setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerLifePoints() {
        return playerLifePoints;
    }

    public void setPlayerLifePoints(int playerLifePoints) {
        this.playerLifePoints = playerLifePoints;
    }

    public String getPlayerItemInHand() {
        return playerItemInHand;
    }

    public void setPlayerItemInHand(String playerItemInHand) {
        this.playerItemInHand = playerItemInHand;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    //---Find PlayerStats elements--------------------------------------------------------------------------------------

    public static String findPlayerName() {
        String name = "";
        for (PlayerStats i : ADVGame.listOfPlayerStats) {
            name.equalsIgnoreCase(i.playerName);
        }
        return name;
    }

    public static int findPlayerLifePoints() {
        int health = 0;
        for (PlayerStats i : ADVGame.listOfPlayerStats) {
            health = i.playerLifePoints;
        }
        return health;
    }
    public static int findPlayerAttackPoints() {

        for (PlayerStats i : ADVGame.listOfPlayerStats) {
                return i.damage;
        }
        return 0;
    }
    public static String findWhatPlayerIsHolding() {
        String held = "";
        for (PlayerStats i : ADVGame.listOfPlayerStats) {
            held.equalsIgnoreCase(i.playerItemInHand);
        }
        return held;
    }

    //---Find PlayerStats elements ends --------------------------------------------------------------------------------



}
