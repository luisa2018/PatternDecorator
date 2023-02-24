package decorators;

import components.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost() {
        return .10 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + " Whip ";
    }
}
