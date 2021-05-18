package builder_demo;

public class chickenPizza extends pizza {
    @Override
   public float price() {
      return 25.0f;
   }

   @Override
   public String name() {
      return "Chicken pizza";
   }

    @Override
    public String size() {
    
        return "large";
    }

    @Override
    public String packing() {
    
        return "box";
    }
}
