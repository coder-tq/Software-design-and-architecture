import pizza.Pizza;
import store.ChicagoPizzaStore;
import store.NYPizzaStore;
import store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan 点了一个 \n" + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel 点了一个 \n" + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan 点了一个 \n" + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel 点了一个 \n" + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan 点了一个 \n" + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel 点了一个 \n" + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan 点了一个 \n" + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel 点了一个 \n" + pizza + "，说没有jb真好吃" + "\n");
    }
}
