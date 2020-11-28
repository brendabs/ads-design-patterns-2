package sales;
import product.Product;

public class BlackFridaySale implements SalesProxy {
  public void sell(Product product) {
    System.out.println("Desconto black friday: 40% \n");
    double newProductPrice = this.getBlackFridayPrice(product.getPrice(), 40);
    product.setPrice(newProductPrice);
    new NormalSale().sell(product);
  }

  private double getBlackFridayPrice (double price, int discount) {
    return price - ((price * discount) / 100);
  }
}
