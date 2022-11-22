package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.Sweets;

public class CherryPie extends Sweets {

    @Override
    public float price() {
        return 29.5f;
    }

    @Override
    public String name() {
        return "Cherry pie";
    }
}
