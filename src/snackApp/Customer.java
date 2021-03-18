package snackApp;

public class Customer
{
    private int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        id = maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double addCashOnHand(double cash)
    {
        return cashOnHand = cashOnHand + cash;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    public double buySnacks(double total)
    {
        return cashOnHand = cashOnHand - total;
    }


}
