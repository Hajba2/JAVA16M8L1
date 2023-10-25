package coffe.abstr;

public class EspressoAddingSugarCoffeeMachine extends AbstractCoffeeMachine {
    private int sugar;

    @Override
    public void makeCoffee() {
        System.out.println("EspressoAddingSugarCoffeeMachine");
        sugar = 0;
    }

    @Override
    public void addSugar() {
        this.sugar = sugar;
    }
}
