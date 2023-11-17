public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing Veggie Pizza");
        dough = ingredientFactory.createDough();
        //System.out.println(dough);
        sauce = ingredientFactory.createSauce();
        //System.out.println(sauce);
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        //System.out.println(cheese);

    }
}
