import services.SalesService;
import product.SimpleProduct;
import product.Product;

import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    SimpleProduct teclado = new SimpleProduct("Teclado Razer Blackwidow", 549.90);
    SimpleProduct headset = new SimpleProduct("Headset HyperX Cloud Core", 446.40);
    SimpleProduct mouse = new SimpleProduct("Mouse Razer Deathadder Essential", 236.90);

    List<Product> products = new ArrayList<>();
    products.add(teclado);
    products.add(headset);
    products.add(mouse);

    SalesService teste = new SalesService();
    teste.sellProduct(products);
  }
}
