package builder_demo;

public class builderMain {
    public static void main(String[] args) {
   
        packageBuilder Builder = new packageBuilder();
  
        meal Meal = Builder.prepareMeal();
        System.out.println("Food Package");
        Meal.showItems();
        System.out.println("Total Cost: " + Meal.getCost());

     }
}
