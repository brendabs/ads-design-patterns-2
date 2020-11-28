package services;
import product.Product;
import product.CompositeProduct;
import product.SimpleProduct;

import helpers.FormatPrice;

import sales.BlackFridaySale;
import sales.NormalSale;
import java.util.List;

public class SalesService implements FormatPrice {
  public String formatPrice (double price) {
    return String.format("%.2f", price);
  }

  public void sellProduct (List<Product> productList) {
    Boolean isCompositeProduct = productList.size() > 1;
    Boolean isBlackFriday = true;
    Product finalProduct = isCompositeProduct
      ? this.mountCompositeProduct(productList)
      : this.mountSimpleProduct(productList);

    if (isBlackFriday) {
      BlackFridaySale blackFridaySale = new BlackFridaySale();
      blackFridaySale.sell(finalProduct);
    } else {
      NormalSale normalSale = new NormalSale();
      normalSale.sell(finalProduct);
    }
  }

  private CompositeProduct mountCompositeProduct (List<Product> productList) {
    System.out.println("Montando pacote de produtos... \n");

    CompositeProduct composite = new CompositeProduct(productList);
    System.out.println(composite.getDescription());
    System.out.println("Preço total com desconto: R$" + formatPrice(composite.getPrice()));

    return composite;
  }

  private SimpleProduct mountSimpleProduct (List<Product> productList) {
    Product product = productList.get(0);

    SimpleProduct simple = new SimpleProduct(product.getDescription(), product.getPrice());

    return simple;
  }
}
