Game:
Main area that reads txt file and where
game is executed with in a while loop. esc exits the game

GameDescription:
Is the class where it holds all information on Rooms.txt.
important Methods = exitGame - exit game on esc command.
realTimeLocation - updates player location

Items:
Is the class where it holds all information on Items.txt
Methods handle pickup, inventory, drop item(still working on that), explore, puzzle(still working on that)

Navigation: In progress

Player: Methods = visitedRoom - keeps track of player.
compass - sets room and gives room description

Puzzle:
Is the class where it holds all information on Puzzle.txt


    Show your map
    Show your text file
    Run your code and show the following scenario:
        Navigate to a room with an item
        Pick up the item
        Inspect the item
        Add the item to the inventory
        Show the player inventory
        Navigate to a different room
        Drop the item from the player inventory into the current room
        Show the player inventory to reflect the item(s) dropped
        Navigate to a different room
        Get back to the room to where you dropped the item to show the dropped item is available there
        Add the item back to the inventory
        Show you are reading things from the text file and not hard coding items, rooms etc.  in your code
