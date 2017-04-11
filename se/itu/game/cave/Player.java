package se.itu.game.cave;

import java.util.List;
import java.util.ArrayList;

public class Player{
  private static Player player;
  private List<Thing> inventory;
  private Room currentRoom;

  private Player(Room room){
      inventory = new ArrayList<Thing>();
      currentRoom = room;
  }
  public static Player getInstance(){
    if (player == null) {
      player = new Player(CaveInitializer.getInstance().getFirstRoom());
    }
  return player;
  }
  public void takeThing(Thing thing){
   // Remove this things from the current room
   // Add this thing to the inventory
  }
  public void dropThing(Thing thing){
  // Check that we can drop this Thing, or
  // throw a new IllegalArgumentException with messge
  // Remove this thing from the inventory
  }
  public List<Thing> inventory(){
  // return a reference to the player's inventory

  // (or if you are fancy, a copy of it or a
  //  view of it which cannot be modified)
  // The last thing is "extra for the ambitious"
  }
  public Room currentRoom(){
  // return a reference to the Player's current Room
  }
  public void go(Direction direction){
    // Ask the current Room for the Room in "direction" and save it
    // Check if the Room in that direction is null, and if so
    //  throw a new IllegalArgumentException with a message
    // If it wasn't null,
    //  change the Player's current Room to the Room above
  }
  @override
  public String toString(){
  // return a string with information about e.g.
  // the current room and the whole inventory.
  }
  /*
  Hint: If you convert a java.util.List toString(), either
  explictly or by using it together with a String + theList,
  you will get a nice String which could look something like this:
  [Bird, Cage, The Egg of Mantumbi]}
  */
}//end of class
