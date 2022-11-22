package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.ColdDrink;

public class Pepsi_Cola extends ColdDrink {

    @Override
    public float price() {
        return 20.0f;
    }

    @Override
    public String name() {
        return "Pepsi Cola";
    }
}
