public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare(){
        System.out.println("Preparing Pepperoni Pizza");
        dough = ingredientFactory.createDough();
        //System.out.println(dough);
        sauce = ingredientFactory.createSauce();
        //System.out.println(sauce);
        cheese = ingredientFactory.createCheese();
        //System.out.println(cheese);
        pepperoni = ingredientFactory.createPepperoni();
    }
    //public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
      //  super();
    //}
}
