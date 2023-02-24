import components.Beverage;
import components.DarkRoast;
import components.Espresso;
import components.HouseBlend;
import decorators.Mocha;
import decorators.Soy;
import decorators.SteamedMilk;
import decorators.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        // beverage 1
        Beverage  beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());
        // beverage 2
        Beverage beverage2 = new DarkRoast();
        beverage2 =  new Mocha(beverage2);
        beverage2 =  new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        // beverage 3
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());

        // beverage 4
        Beverage beverage4 = new DarkRoast();
        beverage4 = new SteamedMilk(beverage4);
        System.out.println(beverage4.getDescription() + " $ " + beverage4.cost());
    }
}
