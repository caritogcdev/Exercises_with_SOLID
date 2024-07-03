public class PrintOrder {
    public void printBook(Order order) {
        System.out.println("Item: " + order.getItems() + ", Total amount: " + order.getTotalAmount());
    }
}
