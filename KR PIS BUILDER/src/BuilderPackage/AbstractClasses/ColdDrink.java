package BuilderPackage.AbstractClasses;

import BuilderPackage.Item;
import BuilderPackage.Packing;
import BuilderPackage.MealPackages.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
