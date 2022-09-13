package entities;

public class OrderItem {
    private int quantity;
    private double price;

    private double subTotal;

    public OrderItem(){

    }

    public OrderItem(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public double subTotal(){
        return getQuantity()*getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total: " + subTotal + "\n");
        return sb.toString();
    }
}
