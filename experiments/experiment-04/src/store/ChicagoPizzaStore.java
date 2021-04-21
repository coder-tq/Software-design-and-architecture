package store;

import factory.ChicagoPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(item)) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("芝加哥芝士披萨");

        } else if ("veggie".equals(item)) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("芝加哥蔬菜披萨");

        } else if ("clam".equals(item)) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("芝加哥生蚝披萨");

        } else if ("pepperoni".equals(item)) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("芝加哥腊肉披萨");

        }
        return pizza;
    }
}
