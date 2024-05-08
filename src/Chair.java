public class Chair extends Furniture{

    public Integer wheels;

    public Chair() {

    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public Chair(Integer stock, String name, Float price, Integer wheels) {
        super(stock, name, price);
        this.wheels = wheels;
    }

    @Override

    public void showProduct()
    {
        System.out.printf("Name: [%s], Price: [%.2f], Stock: [%d]\nWheels: [%d]",name,price,stock,wheels);
    }

}
