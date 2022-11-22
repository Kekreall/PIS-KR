package BuilderPackage.AbstractClasses;

import BuilderPackage.Item;
import BuilderPackage.Packing;
import BuilderPackage.MealPackages.Box;

public abstract class Sweets implements Item {

    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract float price();
}
