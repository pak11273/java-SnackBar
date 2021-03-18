package snackApp;

public class Snack
{
    private int maxId = 0;
    private int id;
    private String name;
    private int qty;
    private double cost;
    private int vendingId;
    private double total = 0;

    public Snack(String name, int qty, double cost, int vendingId)
    {
        id = maxId++;
        this.name = name;
        this.qty = qty;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    public int getId()
    {
        return this.id;
    };

    public String getName()
    {
        return this.name;
    }

    public String setName(String name)
    {
        return this.name;
    }

    public double getCost()
    {
        return this.cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVending(int vendingId)
    {
        this.vendingId = vendingId;
    }

    public int getVending(int vendingId)
    {
        return this.vendingId;
    }

    public int getQuantity()
    {
        return this.qty;
    }

    public int addQuantity(int num)
    {
        return qty = qty + num;
    }

    public void buySnack(int qty)
    {
        this.qty -= qty;
        this.total = total - (cost * qty);
    }

    public double getTotal()
    {
        return total;
    }

}


