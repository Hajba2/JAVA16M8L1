package coffe.inter;

public class CappuchinoCoffeMachine implements CoffeeMashine, AddingSugarMachine {

    private int sugar;

    @Override
    public void makeCoffee() {
        System.out.println("making espresso with milk");
        sugar = 0;
    }

    @Override
    public void addSugar(int sugar) {
        this.sugar = sugar;
    }
}
