package builder_demo;

public class coke extends drink {
    @Override
    public float price() {
       return 25.0f;
    }
 
    @Override
    public String name() {
       return "Coke";
    }
 
     @Override
     public String size() {
     
         return "Small";
     }
 
     @Override
     public String packing() {
     
         return "Bottle";
     }
}
