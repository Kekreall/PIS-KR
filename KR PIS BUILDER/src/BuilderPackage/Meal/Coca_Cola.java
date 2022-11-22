package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.ColdDrink;

public class Coca_Cola extends ColdDrink {

    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public String name() {
        return "Coca Cola";
    }
}
