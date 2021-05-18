package builder_demo;

import java.util.ArrayList;
import java.util.List;

public class meal {
    private List<foodItem> items = new ArrayList<foodItem>();	

   public void addItem(foodItem item){
      items.add(item);
   }

   public float getCost(){
      float total_cost = 0.0f;
      
      for (foodItem item : items) {
         total_cost += item.price();
      }		
      return total_cost;
   }

   public void showItems(){
   
      for (foodItem item : items) {
         System.out.print("Item : " + item.name());
         System.out.print(", Packing : " + item.packing());
         System.out.println(", Price : " + item.price());
      }		
   }
}
