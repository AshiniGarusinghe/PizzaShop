public class PizzaShop {
    public static void main(String[] args) {
        // Plain Pizza with Cheese and Chicken
        Pizza myPizza = new PlainPizza();
        myPizza = new Cheese(myPizza);
        myPizza = new Chicken(myPizza);

        System.out.println("Description: " + myPizza.getDescription());
        System.out.println("Cost: Rs. " + myPizza.getCost());

        // Another Pizza with all 3 toppings
        Pizza deluxePizza = new PlainPizza();
        deluxePizza = new Cheese(deluxePizza);
        deluxePizza = new Onion(deluxePizza);
        deluxePizza = new Chicken(deluxePizza);

        System.out.println("\nDescription: " + deluxePizza.getDescription());
        System.out.println("Cost: Rs. " + deluxePizza.getCost());
    }
}
