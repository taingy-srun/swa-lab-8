package lab8.productservice;

public class Product {
    private String productNumber;
    private String name;
    private int numberOnStock;

    public Product() {}

    public Product(String productNumber, String name) {
        this.productNumber = productNumber;
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOnStock() {
        return numberOnStock;
    }

    public void setNumberOnStock(int numberOnStock) {
        this.numberOnStock = numberOnStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber='" + productNumber + '\'' +
                ", name='" + name + '\'' +
                ", numberOnStock=" + numberOnStock +
                '}';
    }
}
