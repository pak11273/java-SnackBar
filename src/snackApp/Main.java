package snackApp;

import snackApp.Snack;
import snackApp.VendingMachine;

public class Main
{
    public static void main(String[] args)
    {
        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Jane", 33.14);

        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        Snack Chips = new Snack("Chips", 36, 1.75, Food.getId());
        Snack ChocolateBar = new Snack("Chocolate Bar", 36, 1.00, Food.getId());
        Snack Pretzel = new Snack("Pretzel", 30, 2.00, Food.getId());
        Snack Soda = new Snack("Soda", 36, 1.75, Drink.getId());
        Snack Water = new Snack("Water", 36, 1.75, Drink.getId());

        Jane.buySnacks(3 * Soda.getCost());
        Soda.buySnack(3);
        System.out.println("Soda cost: " + Soda.getCost() * 3);
        System.out.println("Jane's cash on hand: " + Jane.getCashOnHand());
        System.out.println("Qty of snack Soda: " + Soda.getQuantity());

        Jane.buySnacks(3 * Pretzel.getCost());
        Pretzel.buySnack(3);
        System.out.println("Jane's cash on hand: " + Jane.getCashOnHand());
        System.out.println("Qty of snack Pretzel: " + Pretzel.getQuantity());

        Bob.buySnacks(2 * Soda.getCost());
        Soda.buySnack(2);
        System.out.println("Bob's cash on hand: " + Bob.getCashOnHand());
        System.out.println("Qty of snack Soda: " + Soda.getQuantity());

        Jane.addCashOnHand(10);
        System.out.println("Jane's cash on hand: " + Jane.getCashOnHand());

        Jane.buySnacks(ChocolateBar.getCost());
        ChocolateBar.buySnack(1);
        System.out.println("Jane's cash on hand: " + Jane.getCashOnHand());
        System.out.println("Qty of snack Chocolate Bar: " + ChocolateBar.getQuantity());

        Pretzel.addQuantity(12);
        System.out.println("Qty of snack Pretzel: " + Pretzel.getQuantity());

        Bob.buySnacks(3 * Pretzel.getCost());
        System.out.println("Bob's cash on hand: " + Bob.getCashOnHand());
        System.out.println("Qty of snack Pretzel: " + Pretzel.getQuantity());
    }
}
