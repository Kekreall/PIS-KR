package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.HotDrink;

public class Tea extends HotDrink {

    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "Tea";
    }
}