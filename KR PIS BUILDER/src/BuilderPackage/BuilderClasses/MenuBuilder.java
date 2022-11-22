package BuilderPackage.BuilderClasses;

import BuilderPackage.Meal.*;

public class MenuBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coca_Cola());
        return meal;
    }

    public Meal prepareChBurgMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi_Cola());
        return meal;
    }

    public Meal prepareCheeseBurgMeal (){
        Meal meal = new Meal();
        meal.addItem(new CheeseBurger());
        meal.addItem(new Coca_Cola());
        return meal;
    }

    public Meal prepareBreakfast (){
        Meal meal = new Meal();
        meal.addItem(new JamSandwich());
        meal.addItem(new Coffee());
        meal.addItem(new CherryPie());
        return meal;
    }

    public Meal prepareTeaDonuts (){
        Meal meal = new Meal();
        meal.addItem(new Tea());
        meal.addItem(new Donut());
        return meal;
    }
}
