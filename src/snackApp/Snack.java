public class Snack
{
    public int maxId = 0;
    public int id;
    public String name;
    public int qty;
    public double cost;
    public int vendingId;

    public Snack(int id, String name, int qty, double cost, int vendingId)
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

    public int getQuantity(int qty)
    {
        return this.qty;
    }

    public int addQuantity(int num)
    {
        return qty + num;
    }

    public int buySnack(int qty)
    {
        return qty;
    }

    public double getTotal()
    {
        return qty * cost;
    }

}


