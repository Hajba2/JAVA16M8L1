package coffe.inter;

public class EspressoAddingSugarCoffeeMachine implements CoffeeMashine, AddingSugarMachine{

    private int amountOfSugar;

    @Override
    public void makeCoffee() {
        System.out.println("EspressoAddingSugarCoffeeMachine");
        amountOfSugar = 0;
    }

    @Override
    public void addSugar(int sugar) {
        this.amountOfSugar = sugar;
    }
}
