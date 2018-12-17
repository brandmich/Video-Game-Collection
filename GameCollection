//represents a collection of video games
import java.text.NumberFormat;

public class GameCollection
{
   private VideoGame [] collection;
   private int count;
   private double totalCost;
   
   //constructor creats an initially empty collection.
   public GameCollection()
   {
      collection = new VideoGame[100];
      count = 0;
      totalCost = 0.0;
   }
   
   //Adds a video game to the collection, increasing the size of the collection array if necessary.
   public void addGame(String title, String publisher, String platform, int year, double cost, boolean complete)
   {
      if(count == collection.length)
         increaseSize();
         
      collection[count] = new VideoGame(title, publisher, platform, year, cost, complete);
      totalCost += cost;
      count++;
   }
   
   //Returns a report describing the video game collection.
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
      report += "My video game collection \n\n";
      
      report += "Number of video games: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost / count);
      report += "\n\nGame List:\n\n";
      
      for(int game = 0; game < count; game++)
         report += collection[game].toString() + "\n";
      
      return report; 
   }
   
   //Increases the capacity of the collection by creating a larger array and copying the existing collection into it.
   private void increaseSize()
   {  
      VideoGame[] temp = new VideoGame[collection.length * 2];
      
      for(int game = 0; game < collection.length; game++)
         temp [game] = collection[game];
      
      collection = temp;
   }
}
