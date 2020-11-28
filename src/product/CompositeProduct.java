package product;

import java.util.List;

public class CompositeProduct implements Product {
  private List<Product> products;
  private double price;

  public CompositeProduct (List<Product> productList) {
    this.products = productList;
  }

  public String getDescription () {
    String compositeName = "Combo: \n";

    for (Product p : this.products) {
      compositeName += p.getDescription() + " - R$" + p.getPrice() + "\n";
    }

    return compositeName;
  }

  public double getPrice () {
    float totalPrice = 0;
    for (Product p : this.products) {
      totalPrice += p.getPrice();
    }

    this.setPrice(totalPrice - 2);

    return this.price;
  }

  public void setPrice (double price) {
    this.price = price;
  }
}
