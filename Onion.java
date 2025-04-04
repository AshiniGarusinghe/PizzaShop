public class Onion extends ToppingDecorator {
    public Onion(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Onion";
    }

    public double getCost() {
        return pizza.getCost() + 30.00;
    }
}
