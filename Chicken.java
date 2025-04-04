public class Chicken extends ToppingDecorator {
    public Chicken(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    public double getCost() {
        return pizza.getCost() + 100.00;
    }
}