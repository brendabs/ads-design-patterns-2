package product;

public class Product {
  private String description;
  private float price;

  public Product (String description, float price) {
    this.description = description;
    this.price = price;
  }

  public String getDescription () {
    return this.description;
  }
  public void setDescription (String description) {
    this.description = description;
  }

  public float getPrice () {
    return this.price;
  }
  public void setPrice (float price) {
    this.price = price;
  }
}
