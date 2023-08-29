package launchcode.launchcode;
import java.util.Date;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem pizza = new MenuItem(12, "Vampire Killer (Extra garlic)","Entrees", true);
        MenuItem pizza1 = new MenuItem(17, "Meat Sweats (all the meats)", "Entrees", true);
        MenuItem jalaPops = new MenuItem(8, "Cheesy Heat Sticks","appetizer", false);
        MenuItem skinz = new MenuItem(8,"Taters keep on tating", "appetizer", false);
        MenuItem canoli = new MenuItem(7,"Canoli your way", "dessert", true);
        MenuItem zeps = new MenuItem(7,"Zep", "dessert", false);

        ArrayList<MenuItem> zah = new ArrayList<>();

        Menu pizzaSpot = new Menu(new Date(), zah);

        pizzaSpot.addItem(zeps);
        pizzaSpot.addItem(canoli);
        pizzaSpot.addItem(skinz);
        pizzaSpot.addItem(jalaPops);
        pizzaSpot.addItem(pizza);
        pizzaSpot.addItem(pizza1);

//        System.out.println(pizzaSpot);
//        pizzaSpot.singleItem(1);

        pizzaSpot.printFullMenu();




    }
}
