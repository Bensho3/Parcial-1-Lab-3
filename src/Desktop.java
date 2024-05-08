public class Desktop extends Furniture{

    public Float height;

    public Float width;

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Desktop()
    {}

    public Desktop(Integer stock, String name, Float price, Float height, Float width) {
        super(stock, name, price);
        this.height = height;
        this.width = width;
    }

    @Override

    public void showProduct()
    {
        System.out.printf("Name: [%s], Price: [%.2f], Stock: [%d]\nWidth: [%.2f], Height: [%.2f] ",name,price,stock,width,height);
    }

}
