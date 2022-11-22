package BuilderPackage.Meal;

import BuilderPackage.AbstractClasses.Sandwich;

public class JamSandwich extends Sandwich {

    @Override
    public float price() {
        return 20f;
    }

    @Override
    public String name() {
        return "Jam sandwich";
    }
}
