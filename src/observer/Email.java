package observer;

public class Email implements StockObserver {
  public void announce () {
    System.out.println("Parabéns, seu produto chegou! \n");
    System.out.println("Prosseguindo com a compra... \n");
  }
}
