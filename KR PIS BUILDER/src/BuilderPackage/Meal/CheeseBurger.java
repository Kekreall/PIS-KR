package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.Burger;

public class CheeseBurger extends Burger {

    @Override
    public float price() {
        return 42.5f;
    }

    @Override
    public String name() {
        return "Cheese Burger";
    }
}
