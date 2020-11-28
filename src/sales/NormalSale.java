package sales;
import product.Product;
import helpers.FormatPrice;

public class NormalSale implements SalesProxy, FormatPrice {
  public String formatPrice (double price) {
    return String.format("%.2f", price);
  }

  public void sell (Product product) {
    System.out.println("Realizando venda... \n");
    System.out.println("Valor do produto: R$ " + formatPrice(product.getPrice()));
  }
}
