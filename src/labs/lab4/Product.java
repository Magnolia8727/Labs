package labs.lab4;

public class Product {

    private String productName;
    private String productId;
    private double productPrice;

    private int quantity;

    public Product() {
    }

    public Product(String productId, double productPrice, int quantity, String productName) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void displayProduct() {

        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Quantity: " + quantity);
    }


    double stockValue(int quantity)
    {
        return quantity * productPrice;
    }

    void addQuantity(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }

    double sale (int quantity)
    {
      if( quantity > 0 && quantity < this.quantity)
      {
          this.quantity = this.quantity -  quantity;
          return productPrice * quantity;
      }

      else
      {
          System.out.println("Invalid Quantity");
          return 0;
      }


    }

}
