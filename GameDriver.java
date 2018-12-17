/*
   I Pledge My honor that I have not cheated, and will not cheat, on this assignment.
   -Brandon Yates, U86485184
*/
//Demonstrates the use of an array of objects.
public class GameDriver
{
   //Creates a GameCollection object and adds some games to it.
   //Prints reports on the status of the collection.
   public static void main(String [] args)
   {
      GameCollection games = new GameCollection();
      
      games.addGame("Call of Duty", "Avtivision", "PlayStation 2", 2003, 12.99, true);
      games.addGame("Kerbal Space Program", "Squad", "PC", 2011, 29.99, false);
      games.addGame("Rainbow Six: Siege", "Ubisoft", "PC", 2015, 35.49, false);
      
      System.out.println(games);
      
      games.addGame("Luigi's Mansion", "Nintendo", "GameCube", 2001 , 15.49, true);
      
      
      System.out.println(games);
   }
}