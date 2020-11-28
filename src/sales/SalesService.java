package sales;
import product.Product;
import java.util.List;

public class SalesService {
  public void sellProduct (List<Product> productList) {
    // products.length = productList.size()
    int listLength = productList.size();
    if (listLength > 1) {
      System.out.println("Composite");
    } else {
      System.out.println("Normal || Black Friday");
    }
  }
}