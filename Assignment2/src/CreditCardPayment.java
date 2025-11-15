public class CreditCardPayment extends CardPayment implements Discount {
    double creditLimit;

    public CreditCardPayment(double amount, String currency, String status, String cardNumber, String cardHolderName, String expiryDate, double creditLimit) {
        super(amount, currency, status, cardNumber, cardHolderName, expiryDate);
        this.creditLimit = creditLimit;
    }

    @Override
    public double applyDiscount(double percent) {
        System.out.println("You are eligible for " + percent + "% Discount");
        discount = amount * (percent / 100);
        return discount;
    }

    @Override
    public double finalAmount() {
        finalAmount = amount - discount; // subtract discount
        return finalAmount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing the payment");
        System.out.println("Your credit limit is : " + creditLimit + " LKR");
    }
    public void applyInterest() {
        System.out.println("Note : Applying interest if payment is not settled by due date");
    }

    @Override
    public void generateReceipt() {
        applyDiscount(10);
        finalAmount();
        System.out.println("PAYMENT RECEIPT");
        System.out.println("Your bill amount : " + amount);
        System.out.println("Discount : "+ discount);
        System.out.println("Total bill amount after the discount : " + finalAmount + " " + currency);
        System.out.println("Status: " + status);
        System.out.println("Reference ID: " + referenceId);
        System.out.println("Thank you for shopping with us.");
        applyInterest();
    }
}
