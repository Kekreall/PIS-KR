package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.Sweets;

public class Donut extends Sweets {

    @Override
    public float price() {
        return 12.5f;
    }

    @Override
    public String name() {
        return "Donut";
    }
}
