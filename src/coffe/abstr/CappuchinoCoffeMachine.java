package coffe.abstr;

public class CappuchinoCoffeMachine extends EspressoCoffeeMachine {

    private int sugar;

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("adding milk");
    }

    @Override
    public void addSugar() {
        this.sugar = sugar;
    }
}
