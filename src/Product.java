// Product.java
public class Product
{
    private static String id ;
    private static String name;
    private static double price;
    private static String description;

    // Constructor
    public Product(String id, String name, double price, String description)
    {
        Product.id = id;
        Product.name = name;
        Product.price = price;
        Product.description = description;
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

    public static String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        Product.name = name;
    }

    public static double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        Product.price = price;
    }

    public static String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        Product.description = description;
    }
}
