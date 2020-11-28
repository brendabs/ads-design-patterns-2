package observer;

public class StockObservable {
  private StockObserver stockObserver;

  protected void announce () {
    this.stockObserver.announce();
  }

  public void addObserver (StockObserver stockObserver) {
    this.stockObserver = stockObserver;
  }
}
