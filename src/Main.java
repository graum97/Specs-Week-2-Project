import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create an ArrayList which contains Cupcake objects called cupcakeMenu
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        //Create a new cupcake object named cupcake
        Cupcake cupcake = new Cupcake();
        //Create a new redvelvet object named redVelvet
        RedVelvet redVelvet = new RedVelvet();
        //Create a new chocolate object named chocolate
        Chocolate chocolate = new Chocolate();
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" + "\nthe menu but we need to decide on pricing");
        //Create a scanner object named input to accept the users input
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?" + "\n(input a numerical number taken to 2 decimal places");
        //Create a String variable named priceText and assign it to the value of input.nextLine()
        String priceText = input.nextLine();
        //Create a double variable named price and set it equal to Double.parseDouble(priceText)
        double price = Double.parseDouble(priceText);
        //Now that the price is set, we can call the setPrice method with the parameter of price
        cupcake.setPrice(price);
        //repeat for other cupcakes
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake?" + "\n(input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?" + "\n(input a numerical number taken to 2 decimal places");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);
        //Add cupcakes to cupcakeMenu
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
    }
}

class Cupcake {
    //Create a public double variable named price, but dont assign it a value
    public double price;
    //Create a public function named getPrice that has no parameters and returns the price
    public double getPrice() {
        return price;
    }
    //Create a public function named setPrice that has one parameter, a double named price, and returns void

    public void setPrice(double price) {
        this.price = price;
    }
    //Create a public function named type that prints a description and returns void
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake {
    //Create a public function named type that returns void and prints a description of the cupcake
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake {
    //Create a public function named type that returns void and prints a description of the cupcake
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

class Drink {
    //Create a public double variable named price, but don't assign it a value
    public double price;
    //Create a public function named getPrice that has no parameters and returns the price
    public double getPrice() {
        return price;
    }
    //Create a public function named setPrice that has one parameter, a double named price, and returns void
    public void setPrice(double price) {
        this.price = price;
    }
    //Create a public function named type that prints a description and returns void
    public void type() {
        System.out.println("A bottle of water");
    }
}

class Soda extends Drink {
    //Create a public function named type that prints a description and returns void
    public void type() {
        System.out.println("A bottle of soda");
    }
}

class Milk extends Drink {
    public void type() {
        System.out.println("A Bottle of Milk");
    }
}