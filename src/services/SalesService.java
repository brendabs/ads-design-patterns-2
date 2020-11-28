package services;
import product.Product;
import product.CompositeProduct;
import product.SimpleProduct;
import product.Stock;

import helpers.FormatPrice;

import sales.BlackFridaySale;
import sales.NormalSale;
import java.util.List;

import observer.Email;

public class SalesService implements FormatPrice {
  private Stock stock = new Stock();

  private void checkStock () {
    if (stock.quantity < 1) {
      System.out.println("Ops, não temos esse produto em estoque no momento. Você será avisado assim que tivermos ele em estoque novamente :)!" + "\n");

      this.stock.addObserver(new Email());

      this.stock.setQuantity();
    }
  }

  public String formatPrice (double price) {
    return String.format("%.2f", price);
  }

  public void sellProduct (List<Product> productList) {
    Boolean isCompositeProduct = productList.size() > 1;
    Boolean isBlackFriday = true;

    this.checkStock();

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
