import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> Shop = new ArrayList<>();

        //CRAR LOS PRODUCTOOOOOOOOOOOOOOOOOOOOOOOOOOOOS
       Chair RazerGamingChair = new Chair(3,"Razer Gaming Chair", 333.33F,6);
       Desktop RazerGamingDesktop = new Desktop(5,"Razer Gaming Desktop", 534.99F,1.72F,2.65F);
       Printer FerrariPrinter = new Printer(7,"Printer Ferrari Special Edition",150F, 350F);
       Notebook TUF = new Notebook(3,"Tuf",450F,1059);

        //OFERTA DE SILLAS E IMPRESORAS!!!!!!

        RazerGamingChair.doADiscount(33F);
        FerrariPrinter.doADiscount(15F);


       //PONER LOS PRODUCTITOS EN LA ARRAYLIST!!!!!!!!!!!!!!
       Shop.add(RazerGamingChair);
       Shop.add(RazerGamingDesktop);
       Shop.add(FerrariPrinter);
       Shop.add(TUF);


       //MOSTRAR PRODCUTOOOOOOOOOOOOOOOOOOOOOOOOS
       System.out.printf("Showing all the products in the shop:\n");
       System.out.printf("\n-----------------------------------------------\n");
       for(int i = 0; i < 4; i++)
       {
           Shop.get(i).showProduct();
           System.out.printf("\n-----------------------------------------------\n");
       }


       Float percentage = 5F;
       //AUMENTAR PRECIOS :) $$$++
        for (int i = 0; i<4; i++)
        {
            System.out.printf("Old price of the product: [%.2f]\n",Shop.get(i).getPrice());
            Shop.get(i).increaseProcuctValue(percentage);
            System.out.printf("New price of the product: [%.2f]\n\n", Shop.get(i).getPrice());
            percentage = percentage + 5F;
        }



    }
}
