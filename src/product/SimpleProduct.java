package product;

public class SimpleProduct implements Product {
  private String description;
  private double price;

  public SimpleProduct (String description, double price) {
    this.description = description;
    this.price = price;
  }

  public String getDescription () {
    return this.description;
  }
  public void setDescription (String description) {
    this.description = description;
  }

  public double getPrice () {
    return this.price;
  }
  public void setPrice (double price) {
    this.price = price;
  }
}
