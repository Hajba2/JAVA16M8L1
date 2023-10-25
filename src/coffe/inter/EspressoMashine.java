package coffe.inter;

public class EspressoMashine implements CoffeeMashine {


    @Override
    public void makeCoffee() {
        System.out.println("Espresso");
    }
}
