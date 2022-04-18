package Gift;

import java.util.ArrayList;
import java.util.Scanner;

public class NewYearGift {
    public static void main(String[] Args){
        giftBuilder();
    }
    public static void giftBuilder() {
        ArrayList<Sweets> sweets = new ArrayList<>();
        int finPrice = 0;
        int finWeight = 0;
        boolean done = false;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Press the corresponding buttons to add Candy/Jellybeans/Chocolate");
        System.out.println("\"Rot Front'\" Candy - '1'");
        System.out.println("\"Fini\" Jellybeans - '2'");
        System.out.println("\"Alenka\" Chocolate - '3'");
        System.out.println("To exit this menu - '4'");
        while (!done) {
            String choice = scanner.nextLine();
            switch (choice) {
                case ("1") :
                    Candy candyRF = new Candy("Candy \"Rot Front\"", 1500, 400, "Very sweet");
                    sweets.add(candyRF);
                    finPrice += candyRF.getPrice();
                    finWeight += candyRF.getWeight();
                    System.out.println("\" Rot Front\" candy was added to gift");
                    break;
                case ("2") :
                    Jellybeans jellyFini = new Jellybeans("\"Fini\" Jellybeans", 200, 100, "Crunchy outside, soft and tasty inside");
                    sweets.add(jellyFini);
                    finPrice += jellyFini.getPrice();
                    finWeight += jellyFini.getWeight();
                    System.out.println("\"Fini\" Jellybeans were added to gift");
                    break;
                case ("3") :
                    Chocolate chocolateAlenka = new Chocolate("\"Alenka\" Chocolate", 120, 100, "No additional info needed");
                    sweets.add(chocolateAlenka);
                    finPrice += chocolateAlenka.getPrice();
                    finWeight += chocolateAlenka.getWeight();
                    System.out.println("\"Alenka\" Chocolate was added to gift");
                    break;
                case ("4") :
                    done = true;
                    break;
                default:
                    System.out.println("Chose a product using '1' '2' '3', please, or exit with '4'");
            }
            int i = 0;
            System.out.println("\n Your gift contains: ");
            for (Sweets sweet:sweets) {
                i++;
                System.out.println(i + ". " + sweet.getName() + " - "  + sweet.getAdditionalInfo());
            }
            System.out.println(String.format("\n Your gift weight is: %s g.\n Your gift price is: %s $", finWeight, finPrice));
        }
    }
}
