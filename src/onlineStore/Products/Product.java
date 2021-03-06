package onlineStore.Products;

public abstract class Product {
    private String description;
    private double price;
    private String image;

    public Product( String image, double price, String description) {
        this.description = description;
        this.price = price;
        this.image = image;
    }
    @Override
    public String toString() {
        return String.format("Image: %s\nPrice: %.2f$\nDescription: %s", image, price, description);
    }
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public abstract void showDescription();


}
