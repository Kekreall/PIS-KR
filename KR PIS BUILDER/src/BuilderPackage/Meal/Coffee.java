package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.HotDrink;

public class Coffee extends HotDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Coffee";
    }
}
