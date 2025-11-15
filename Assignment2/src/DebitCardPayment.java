public class DebitCardPayment extends CardPayment implements Discount{
    double availableBalance;

    public DebitCardPayment(double amount, String currency, String status, String cardNumber, String cardHolderName, String expiryDate, double availableBalance) {
        super(amount, currency, status, cardNumber, cardHolderName, expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public double applyDiscount(double percent) {
        System.out.println("You are eligible for " + percent + "% Discount");
        discount = amount * (percent / 100);
        return discount;
    }

    @Override
    public double finalAmount() {
        finalAmount = amount - discount;
        return finalAmount;
    }

    public boolean checkSufficientBalance(){
        System.out.println("Checking whether card balance is sufficient for the payment...");
        return availableBalance >= finalAmount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing the payment");
        System.out.println("Available balance is : " + availableBalance + " LKR");
    }

    @Override
    public void generateReceipt() {
        applyDiscount(13);
        finalAmount();
        System.out.println("PAYMENT RECEIPT");
        System.out.println("Your bill amount : " + amount);
        System.out.println("Discount : "+ discount);
        System.out.println("Total bill amount after the discount : " + finalAmount + " " + currency);
        System.out.println("Status: " + status);
        System.out.println("Reference ID: " + referenceId);
        System.out.println("Thank you for shopping with us.");
    }

}
