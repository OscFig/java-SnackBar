package snackBarApp;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, double quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId; 
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

    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    public void setVedingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public double getQuantity()
    {
        return quantity;
    }
    public void addQuantity(double quantity)
    {
        this.quantity += quantity;
    }
    public void buySnack(double quantity)
    {
        this.quantity -= quantity;
    }
    public void totalCost(double quantity)
    {
        this.cost *= quantity;
    }
    
}