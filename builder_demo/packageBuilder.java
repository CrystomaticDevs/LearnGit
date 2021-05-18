package builder_demo;

public class packageBuilder {
    public meal prepareMeal (){
        meal meal = new meal();
        meal.addItem(new chickenPizza());
        meal.addItem(new coke());
        return meal;
     }   
  
}
