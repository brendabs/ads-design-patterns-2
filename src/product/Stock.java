package product;

import observer.StockObservable;

public class Stock extends StockObservable {
  public int quantity = 0;

  public void setQuantity () {
    this.quantity += 1;

    announce();
  }
}
