package se.itu.game.cave;

public class IllegalMoveException extends Exception{
  public IllegalMoveException(String message){
    super(message);
  }
}
