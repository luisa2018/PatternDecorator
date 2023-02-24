package components;

public abstract class Beverage {

    String description = "Unknown components.Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();

}
