package BuilderPackage;

import BuilderPackage.BuilderClasses.Meal;
import BuilderPackage.BuilderClasses.MenuBuilder;
import java.util.Scanner;

public class BuilderPatternDirector {
    public static void main(String[] args) {

        Scanner IN = new Scanner(System.in);

        MenuBuilder mealBuilder = new MenuBuilder();

        System.out.println("\n     M-E-N-U:" +
                "\n1. Vegetarian menu\n2. ChickenBurger menu\n" +
                "3. CheeseBurger menu\n4. Breakfast menu\n" +
                "5. Tea menu\nWhat You want:");
        int ch;
        ch = IN.nextInt();

        switch (ch){

            case 1:
                Meal VegMeal = mealBuilder.prepareVegMeal();
                System.out.println("Veg menu");
                VegMeal.showItems();
                System.out.println("Total Cost: " + VegMeal.getCost());
                break;

            case 2:
                Meal ChBurgMeal = mealBuilder.prepareChBurgMeal();
                System.out.println("\n\nChickBurg menu");
                ChBurgMeal.showItems();
                System.out.println("Total Cost: " + ChBurgMeal.getCost());
                break;

            case 3:
                Meal CheeseBurgMeal = mealBuilder.prepareCheeseBurgMeal();
                System.out.println("\n\nCheeseBurg menu");
                CheeseBurgMeal.showItems();
                System.out.println("Total Cost: " + CheeseBurgMeal.getCost());
                break;

            case 4:
                Meal BreakfMeal = mealBuilder.prepareBreakfast();
                System.out.println("\n\nBreakfast menu");
                BreakfMeal.showItems();
                System.out.println("Total Cost: " + BreakfMeal.getCost());
                break;

            case 5:
                Meal TeaMeal = mealBuilder.prepareTeaDonuts();
                System.out.println("\n\nTea menu");
                TeaMeal.showItems();
                System.out.println("Total Cost: " + TeaMeal.getCost());
                break;

            //default:
            //   System.out.println("You missed. Try again.");


        }

    }

}
