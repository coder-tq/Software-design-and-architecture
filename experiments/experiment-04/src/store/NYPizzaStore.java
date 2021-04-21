package store;

import factory.NYPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import pizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if ("cheese".equals(item)) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("纽约芝士披萨");

        } else if ("veggie".equals(item)) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("纽约蔬菜披萨");

        } else if ("clam".equals(item)) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("纽约蛤蜊披萨");

        } else if ("pepperoni".equals(item)) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("纽约腊肉披萨");

        }
        return pizza;
    }
}
