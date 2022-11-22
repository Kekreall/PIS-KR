package BuilderPackage.AbstractClasses;

import BuilderPackage.Item;
import BuilderPackage.Packing;
import BuilderPackage.MealPackages.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}