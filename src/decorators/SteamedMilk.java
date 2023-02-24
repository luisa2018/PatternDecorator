package decorators;

import components.Beverage;

public class SteamedMilk extends CondimentDecorator{
    Beverage beverage;
    public SteamedMilk(Beverage beverage){
      this.beverage= beverage;
    }

    public double cost() {
        return .10 + beverage.cost();
    }


    public String getDescription() {
        return beverage.getDescription() + " Steamed Milk ";
    }
}
