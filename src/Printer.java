public class Printer extends InformaticProduct{

    public Float IPM;

    public Float getIPM() {
        return IPM;
    }

    public void setIPM(Float IPM) {
        this.IPM = IPM;
    }

    public Printer() {
    }

    public Printer(Integer stock, String name, Float price, Float IPM) {
        super(stock, name, price);
        this.IPM = IPM;
    }

    @Override

    public void showProduct()
    {
        System.out.printf("Name: [%s], Price: [%.2f], Stock: [%d]\nBrand [%s] IPM: [%.2f]",name,price,stock,brand,IPM);
    }

}
