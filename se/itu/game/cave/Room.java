package se.itu.game.cave;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Room{
  private String description;
  private Room north;
  private Room east;
  private Room south;
  private Room west;
  private List<Thing> things;

  public static enum Direction{
    NORTH,
    EAST,
    SOUTH,
    WEST;
  }
  public Room(String description,
              Room north,
              Room east,
              Room south,
              Room west,
              List<Thing> things){
    if ( description == null || things == null){
      throw new NullPointerException("<<Things or Description cannot be null>>");
    }
    this.description=description;
    this.north=north;
    this.east=east;
    this.south=south;
    this.west=west;
    this.things=things;
  }
  public void setConnectingRoom(Direction direction, Room room){
    switch (direction) {
      case NORTH:
        north = room;
        break;
      case EAST:
        east = room;
        break;
      case SOUTH:
        south = room;
        break;
      case WEST:
        west = room;
        break;
      default: // This is actually a case where we can skip the default label!
        throw new IllegalArgumentException("<<Direction invalid>>");
    }
  }
  public List<Thing> things(){
    List unmodifiableList = Collections.unmodifiableList(things);
    return unmodifiableList;
  // Return an unmodifialble view of the things list
  }
  public Thing removeThing(Thing thing){
  // Check if thing is null, and if so,
  //   throw a new NullPointerException with a message
  // If we can remove the thing from our things-list,
  //   remove it and return the thing.
  // Otherwise (we couldn't remove it), throw
  // a new IllegalArgumentException with a message.
  }
  public void putThing(Thing thing){
  // IF the thing is null, throw a new NullPointerException
  //   with a message.
  // If we already have the Thing in the room, throw a new
  //   IllegalArgumentException with a message.
  // Otherwise, add the thing to the rooms list of things.
  }
  public Room getRoom(Direction direction){
  // Use a switch-case or an if-else-if statement
  // to decide what room to return.
  // You know the direction from the parameter,
  // so you should simply decide which of your
  // instance variables of connecting Room:s to
  // return.
  }
  public String description(){
  // Return a String with the description for this Room
  // e.g. the instance variable holding this information.
  }
  @override
  public String toString() {
  // Return a String describing this room.
  // Perhaps, the description and the list of things?
  }
}//end of class (go home)
