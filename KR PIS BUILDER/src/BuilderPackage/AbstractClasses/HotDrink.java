package BuilderPackage.AbstractClasses;

import BuilderPackage.Item;
import BuilderPackage.Packing;
import BuilderPackage.MealPackages.Cup;

public abstract class HotDrink implements Item {

    @Override
    public Packing packing() {
        return new Cup();
    }

    @Override
    public abstract float price();
}
