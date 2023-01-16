
What to know
-No spaces when typing command
-Have to have a weapon to fight monster
Go around each room and pick all item and equip the helmet and add health points,
equip medkit and it adds 20 points of health does not go above 100,
equip sword to fight monster. You can do all that when fighting monster.
There is a fun small puzzle as well.
----Commands----
Y or N
Inventory
a or attack
Equiip(e)
Unequip(u)
Explore
Health
drop
inspect
Pickup
leave

ADVGames
This class is responsible for reading all txt file and adding all
elements to the class objects and to there specified list. This also
takes care of user input through out the game(base of operations)

Items
This class holds everything for the items txt file and handles everything item related.
This class finds elements for the item arraylist.
This class has menus for inventory for both in and outside rooms.
This class directs players to the item, puzzle, monster.
This class is responsible for showing health, inventory, what is equipped and not equipped.


Monster
This class holds everything for the Monster txt file and handles everything Monster related.
This class finds elements for the Monster arraylist.
This class has a intro to the monster and directory to the Monster fight.


Player
This class holds everything for the Player txt file and handles everything Player related.
This class finds elements for the Player arraylist.
Player keeps track of the player.
This class is responsible for adding and subtracting from the player attack points and health points


PlayerStats
This class holds everything for the PlayerStats txt file and handles everything PlayerStats related.
This class finds elements for the PlayerStats arraylist.


Puzzles
This class holds everything for the Puzzles txt file and handles everything Puzzles related.
This class finds elements for the Puzzles arraylist.
This class has a intro to the puzzle and directory to the game.
This class has the playable game.


Rooms
This class holds everything for the Rooms txt file and handles everything Rooms related.
This class has a exit method to the whole game
This class keeps track of visited rooms


UserNav
This class holds everything for the UserNav txt file and handles everything UserNav related.
This class handles the navigation of the player, directs the player in the right direction
This class handles the right directional user input
UserNav extends from Rooms class

----------How each one is set up----------
items.txt
id
id director - 1 weapon, -2 armor, -1 health
Item name
Item damage
Item description


Monster.txt
id
Monster name
Monster description
Monster damage
Monster threshold
Monster Life


myRooms.txt
id
Room name
Room description
direction N
direction E
direction S
direction W


Player.txt
Player name
Player health
Player damage
Player default place holder


puzzles.txt
id
Puzzle name
Puzzle description
Puzzle answer
Puzzle tries





