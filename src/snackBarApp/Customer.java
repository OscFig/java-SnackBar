package snackBarApp;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;


    // behaviors - methods, actions
    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    
    // methods
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

    public void addToCash(double extraCash)
    {
        this.cash += extraCash;
    }

    public double getCash()
    {
        return cash;
    }
    public void buySnack(double totalCost)
    {
        cash = cash - totalCost;
    }
}
