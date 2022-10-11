import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //Create public constructor function named order - parameters: ArrayList of cupcake objects named cupcakeMenu, and an ArrayList Drink objects named drinkMenu
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        //Create a scanner object to hold the user's input
        Scanner input = new Scanner(System.in);
        //Create a string  object named placeOrder and make it equal the user's input
        String placeOrder = input.nextLine();
        //Create an ArrayList to contain objects
        ArrayList<Object> order = new ArrayList<Object>();
        //Create an if statement that checks if placeOrder equals Y ignoring capitalization
        if (placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu");
            System.out.println("CUPCAKES:");
            int itemNumber = 0;
            //Create a for loop that iterates through the indexes of the cupcakeMenu
            for (i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;
                System.out.print(itemNumber + ".");
                //Print a description of the cupcake at the index i
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
                System.out.println();
            }
            System.out.println("DRINKS:");
            //Create a for loop that iterates through the indexes of the drinkMenu
            for (i = 0; i < drinkMenu.size(); i++) {
                itemNumber++;
                System.out.print(itemNumber + ".");
                drinkMenu.get(i).type();
                System.out.println("Price: $" + drinkMenu.get(i).getPrice());
                System.out.println();
            }
            boolean ordering = true;
            //Create a While loop that continues as long as ordering equals true
            while (ordering) {
                System.out.println("What would you like to order? Please use the number associated with each item to order");
                int orderChoice = input.nextLine();
                input.nextLine();
                //Create an if statement that checks if orderChoice equals 1
                if (orderChoice == 1) {
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order");
                } else if (orderChoice == 2) {
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order");
                } else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order");
                } else if (orderChoice == 4) {
                    order.add(drinkMenu.get(0));
                    System.out.println("Item added to order");
                } else if (orderChoice == 5) {
                    order.add(drinkMenu.get(1));
                    System.out.println("Item added to order");
                } else if (orderChoice == 6) {
                    order.add(drinkMenu.get(2));
                    System.out.println("Item added to order");
                } else {
                    System.out.println("Sorry, we don't seem to have that item on the menu");
                }
                System.out.println("Would you like to continue ordering?  (Y/N)");
                String continueOrder = input.nextLine();
                //Create an if statement to check if continueOrder does not equal Y - ignoring capitalization
                if (!continueOrder.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
            }
        } else {
            System.out.println("Have a nice day then");
        }
    }
}
