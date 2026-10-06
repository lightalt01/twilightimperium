public class npc{ //placeholder name
   private int commodities, tGoods, vPoints, aRating;
   private String name;
   private Faction faction;
   
   public npc(String name, int aRating, Faction faction){
      this.name = name;
      this.aRating = aRating;
      this.faction = faction;
      this.tGoods = 0;
      this.vPoints = 0;
      this.commodities = 0;
   }
   
  //info methods
   public int getCommodities(){
      return commodities;
   } 
   
  //set methods
   public void exCommodities(int exchanged){ //method to transform npc commodities into trade goods
      commodities -= exchanged;
      tGoods += exchanged;
   } 
}
