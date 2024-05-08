public abstract class Product {

    public Integer stock;

    public String name;

    public Float price;

    public Product() {
    }

    public Product(Integer stock, String name, Float price) {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void showProduct()
    {}

    public Float doADiscount(Float percentage)
    {
        price = price / 100*percentage;
        return price;

    }

    public Float increaseProcuctValue(Float percentage)
    {
        price = price * percentage;
        return price;
    }


}
