import java.text.NumberFormat;
//represents a Video Game disk

public class VideoGame
{
   private String title, publisher, platform;
   private int year;
   private double cost;
   private boolean complete;
   
   //creates a new video game with the specified information
   public VideoGame(String title, String publisher, String platform, int year, double cost, boolean complete)
   {
      this.title = title;
      this.publisher = publisher;
      this.platform = platform;
      this.year = year;
      this.cost = cost;
      this.complete = complete;
   }
   
   //Returns a string description of this video game
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      String description;
      
      description = fmt.format(cost) + "\t" + year + "\t";
      description += title + "\t" + publisher + "\t" + platform;
      
      if(complete)
         description += "\t" + "Finished";
      return description;
   }
}
