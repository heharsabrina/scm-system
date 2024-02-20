// Product.java
public class Product
{
    private static String id ;
    private String name;
    private static double price;
    private String description;

    // Constructor
    public Product(String id, String name, double price, String description)
    {
        Product.id = id;
        this.name = name;
        Product.price = price;
        this.description = description;
    }

    // Getters and setters
    public static String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        Product.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        Product.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
