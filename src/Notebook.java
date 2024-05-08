public class Notebook extends InformaticProduct{

    public Integer memory;

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Notebook() {
    }

    public Notebook(Integer stock, String name, Float price, Integer memory) {
        super(stock, name, price);
        this.memory = memory;
    }

    @Override

    public void showProduct()
    {
        System.out.printf("Name: [%s], Price: [%.2f], Stock: [%d]\nBrand: [%s] Memory: [%d]",name,price,stock,brand,memory);
    }

}
