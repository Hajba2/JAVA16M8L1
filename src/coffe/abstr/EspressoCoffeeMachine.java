package coffe.abstr;

public class EspressoCoffeeMachine extends AbstractCoffeeMachine{

    @Override
    public void makeCoffee() {
        System.out.println("making espresso");
    }

    @Override
    public void addSugar() {
        System.out.println("not working function");
    }
}
