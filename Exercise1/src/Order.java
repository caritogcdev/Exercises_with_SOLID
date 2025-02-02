import java.util.List;

public class Order {
    private List<String> items;
    private double totalAmount;

    public Order(List<String> items, double totalAmount){
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public List<String> getItems(){
        return items;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
