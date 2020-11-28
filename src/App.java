import sales.Sale;
import sales.SalesService;
import sales.BlackFridaySale;
import product.Product;

import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    Product teste1 = new Product("Produto 1", 10);
    Product teste2 = new Product("Produto 1", 10);
    Product teste3 = new Product("Produto 1", 10);

    List<Product> products = new ArrayList<>();
    products.add(teste1);
    products.add(teste2);
    products.add(teste3);

    SalesService teste = new SalesService();
    teste.sellProduct(products);
  }
}
