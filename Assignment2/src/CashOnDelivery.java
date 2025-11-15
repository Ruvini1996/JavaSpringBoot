public class CashOnDelivery extends Payment{
     String deliveryAddress;

    public CashOnDelivery(double amount, String currency, String status, String deliveryAddress) {
        super(amount, currency, status);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public boolean validate() {
        if (amount >= 0)
            System.out.println("Your order validation successful");
        return true;
    }

    @Override
    public void generateReceipt() {
        System.out.println("Your Order will receive soon, Thank you for shopping with us!");
    }

    @Override
    public void processPayment() {
        System.out.println("Cash will be collected at " + deliveryAddress);
        status = "Pending";
        System.out.println("payment status : "+ status);
    }
}
