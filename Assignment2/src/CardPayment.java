import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class CardPayment extends Payment {
    String cardNumber;
    String cardHolderName;
    String expiryDate;
    String today;
    protected double finalAmount;
    double discount;


    public CardPayment(double amount, String currency, String status, String cardNumber, String cardHolderName, String expiryDate) {
        super(amount, currency, status);
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean validate() {
        try {
            LocalDate expiry = LocalDate.parse(expiryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate today = LocalDate.now();
            System.out.println("Card Validation Successful");

            // true if expiry is today or in the future
            return !expiry.isBefore(today);

        } catch (Exception e) {
            System.out.println("Invalid Card!");
            return false;
        }
    }

    public void processPayment(){
        System.out.println("Processing the payment...");
    }
    @Override
    public void generateReceipt() {
        System.out.println("PAYMENT RECEIPT");
        System.out.println("Your bill amount : " + amount);
        System.out.println("Discount : "+ discount);
        System.out.println("Total bill amount after the discount : " + finalAmount + " " + currency);
        System.out.println("Status: " + status);
        System.out.println("Reference ID: " + referenceId);
        System.out.println("Thank you for shopping with us");
    }
}
