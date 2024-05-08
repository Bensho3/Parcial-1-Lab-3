public abstract class InformaticProduct extends Product{

    public String brand = "Mitsubishi";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public InformaticProduct() {
    }

    public InformaticProduct(Integer stock, String name, Float price) {
        super(stock, name, price);
        this.brand = brand;
    }
}
