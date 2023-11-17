import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What style of pizza? New York or Chicago");
        String style = myObj.nextLine();

        System.out.println("What toppings? cheese, veggie, pepperoni and clam");
        String toppings = myObj.nextLine();

        if(style.equals("New York")){
            // The driver for ordering a pizza from any franchise
            NYPizzaStore store = new NYPizzaStore() {};
            String pizza = String.valueOf(store.createPizza(toppings));
            System.out.println(pizza);

        }
        else{
            // The driver for ordering a pizza from any franchise
            ChicagoPizzaStore store = new ChicagoPizzaStore() {};
            String pizza = String.valueOf(store.createPizza(toppings));
            System.out.println(pizza);
        }


    }
}